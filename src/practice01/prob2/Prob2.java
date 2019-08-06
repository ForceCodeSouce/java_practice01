package practice01.prob2;

import java.util.Scanner;

public class Prob2 {
	
	public void numberCycle() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int num = 1;
		
		for(i = 0; i < 9; i++) {
	
			for(j = 0; j < 10; j++) {
				System.out.print(num + j + " ");
			}
			System.out.println();
			num++;
		}
			
	}
	
	public static void main (String args[]) {
		Prob2 pb = new Prob2();
		pb.numberCycle();
	}
}
