package practice01.prob4;

import java.util.Scanner;

public class Prob4 {

	public void stringCount() {
		int i = 0;
		int j = 0;
		String message = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요 : ");
		message = sc.nextLine();

		char[] messageArray = new char[message.length()];

		for (i = 0; i < message.length(); i++) {
			messageArray[i] = (message.charAt(i));
			// System.out.println(messageArray[i]);
		}

		for (i = 0; i <= message.length(); i++) {

			System.out.println(message.substring(0, i));

		}
	}

	public static void main(String args[]) {
		Prob4 pb = new Prob4();
		pb.stringCount();
	}
}
