package com.lailah;

public class ThreadC {
	public void run() {
		for(int k=1; k<=5; k++) {
			System.out.println("\tFrom Thread C : k = "+k);
		}
		System.out.println("Exit from C");
	}
}
