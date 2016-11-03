package com.test.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableAndFuture {
	public static void main(String[] args) {
		// test01();
//		test02();
		test03();
	}
	
	/**
	 * 原始模式 
	 */
	public static void test01() {
		Callable<Integer> callable = new Callable<Integer>() {
			public Integer call() throws Exception {
				Thread.sleep(5000);// 可能做一些事情
				return new Random().nextInt(100);
			}
		};
		FutureTask<Integer> future = new FutureTask<Integer>(callable);
		new Thread(future).start();
		try {
			System.out.println(future.get());
			System.out.println("11111111");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * 
	 */
	public static void test02() {
		ExecutorService threadPool = Executors.newCachedThreadPool();
		CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(threadPool);
		cs.submit(new Callable<Integer>() {
			public Integer call() throws Exception {
				return new Random().nextInt(100);
			}
		});
		try {
			System.out.println(cs.take().get());
		} catch (InterruptedException e) {			
			e.printStackTrace();
		} catch (ExecutionException e) {		
			e.printStackTrace();
		}
	}
	
	public static void test03(){
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		Future<Integer> future = threadPool.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }  
        });
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {			
			e.printStackTrace();
		} catch (ExecutionException e) {			
			e.printStackTrace();
		}
	}
}