package practice01.prob1;

import java.util.Scanner;

public class Prob1 {
	
	public void inputNum() {
		int number;
		
		Scanner sc = new Scanner(System.in);
		

		
		while(true) {
			System.out.println("값을 입력하세요. 멈추려면 0을 입력하세요");
			number = sc.nextInt();

			if(number%3==0) {
				System.out.println(number + "  :  "+ "3의 배수를 입력하였습니다");
		
			}else {
				System.out.println(number + "  :  " + "3의 배수가 아닙니다.");
			}
			
			if(number == 0) {
				System.out.println("종료");
				break;
			}
		}
	}
		
	public static void main (String args[]) {
		
		Prob1 pb = new Prob1();
		pb.inputNum();
	
	}
	
}
