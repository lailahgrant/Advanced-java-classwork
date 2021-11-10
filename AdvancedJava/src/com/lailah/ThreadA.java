package com.lailah;

public class ThreadA extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("\tFrom Thread A : i = "+i);
		}
		System.out.println("Exit from Thread A");
	}
}
