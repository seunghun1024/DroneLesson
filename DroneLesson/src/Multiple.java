
public class Multiple {
	public static void main(String[] args) {
		int startnum = 1;
		int limitnum = 1000;
		int multi1 = 3;
		int multi2 = 5;
		int num = 0;
		for (int i = startnum; i < limitnum; i++) {
			if (i % multi1 == 0 || i % multi2 == 0) {
				num += i;
			}
		}
		System.out.println(startnum + "에서 " + limitnum + "사이의 " + multi1 + ", " + multi2 + "의 배수의 합은 " + num + "입니다.");
	}
}

/*
 * 3과 5의 배수 숫자의 합 구하기 1~10 사이의 3과 5의 배수는 3, 5, 6, 9입니다. 이들의 합은 23입니다. 1~1000 사이의
 * 3과 5의 배수 합을 구하세요.
 */