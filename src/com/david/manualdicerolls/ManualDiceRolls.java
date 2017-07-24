package com.david.manualdicerolls;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.omg.SendingContext.RunTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Created by Super.Sun on 2017/7/6.
 */
public class ManualDiceRolls {

    private static final int N = 100000000;

    private final double fraction;
    private final Map<Integer, Double> results;
    private final int numberOfThreads;
    private final ExecutorService exeutor;
    private final int workPerThread;

    public ManualDiceRolls() {
        fraction = 1.0 / N;
        results = new ConcurrentHashMap<>();
        numberOfThreads = Runtime.getRuntime().availableProcessors();
        exeutor = Executors.newFixedThreadPool(numberOfThreads);
        workPerThread = N / numberOfThreads;
    }

    private List<Future<?>> submitJobs() {
        List<Future<?>> futures = new ArrayList<>();
        for (int i = 0; i < numberOfThreads; i++) {
            futures.add(exeutor.submit(makeJob()));
        }
        return futures;
    }

    private Runnable makeJob() {
        return () -> {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            for (int i = 0; i < workPerThread; i++) {
                int entry = twoDiceThrows(random);
                accumulateResult(entry);

            }
        };
    }

    //扇子随机两次值相加
    private int twoDiceThrows(ThreadLocalRandom random) {
        int firstThrow = random.nextInt(1, 7);
        int secondThrow = random.nextInt(1, 7);
        return firstThrow + secondThrow;
    }

    private void accumulateResult(int entry) {
        results.compute(entry, (key, previous)->
                previous==null?fraction:previous+fraction
        );
    }

    private void awaitCompletion(List<Future<?>> futures) {
        futures.forEach((future -> {
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }));
        exeutor.shutdown();
    }

    public void simulateDiceRoles(){
        List<Future<?>> futures=submitJobs();
        awaitCompletion(futures);
        printResults();
    }

    public void printResults(){
        results.entrySet().forEach(System.out::println);
    }

    public static void main(String[] args) {
        ManualDiceRolls roles=new ManualDiceRolls();
        roles.simulateDiceRoles();
    }
}
