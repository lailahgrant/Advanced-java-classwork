package com.lailah;

public class ThreadB {
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println("\tFrom Thread B : j="+j);
		}
		System.out.println("Exit from Thread B");
	}
}
