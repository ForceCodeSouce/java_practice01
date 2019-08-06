package practice01.prob5;

public class Prob5 {

	public void game() {
		String num = null;
		int i = 0;
		int a = 3;

		for (i = 1; i < 100; i++) {

			int s1 = i / 10; // 10의자리
			int s2 = i % 10; // 1의 자리
	
			if (s1 == 3 && s2 == 3) {
				System.out.println(i + " : " + "짝짝");
			}else if(s1 == 3 && s2 == 6) {
				System.out.println(i + " : " + "짝짝");
			}else if(s1 == 3 && s2 == 9) {
				System.out.println(i + " : " + "짝짝");
			}else if (s1 == 6 && s2 == 3) {
				System.out.println(i + " : " + "짝짝");
			}else if(s1 == 6 && s2 == 6) {
				System.out.println(i + " : " + "짝짝");
			}else if(s1 == 6 && s2 == 9) {
				System.out.println(i + " : " + "짝짝");
			}else if (s1 == 9 && s2 == 3) {
				System.out.println(i + " : " + "짝짝");
			}else if(s1 == 9 && s2 == 6) {
				System.out.println(i + " : " + "짝짝");
			}else if(s1 == 9 && s2 == 9) {
				System.out.println(i + " : " + "짝짝");
			}else if (s1 == 3 || s1 == 6 || s1 == 9 || s2 == 3 || s2 == 6 || s2 == 9) {
				System.out.println(i + " : " + "짝");
			}

		}

	}

	public static void main(String args[]) {
		Prob5 pb = new Prob5();
		pb.game();
	}
}
