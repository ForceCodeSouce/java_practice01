package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	
	public void numberAdd() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int i = 0;
		int result = 0;
		while(true) {
			System.out.println("숫자를 입력하세요 :");
			input = sc.nextInt();
			
			if(input%2 ==0) {
				System.out.println("짝수");
				for(i = 0 ;i <= input; i++) {
					if(i%2 == 0)
					{
						result += i;
					}
				}
			}else {
				System.out.println("홀수");
				for(i = 0 ;i <= input; i++) {
					
					if(i%2 != 0)
					{
						result += i;
					}
				}
			}
			System.out.println(result);
			result = 0;
		}
	}
	public static void main (String args[]) {
		Prob3 pb = new Prob3();
		pb.numberAdd();
	}
}
