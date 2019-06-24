import java.math.BigInteger;

public class Factorial {
	public static void main(String[] args) {
		BigInteger num = new BigInteger("20");
		BigInteger factnum = factorial(num);
		int realsumnum = 0;
		int length = factorial(num).toString().length() - 1;
		for(int i = length; i > 0; i--) {
			BigInteger sumnum = factnum.divide(BigInteger.valueOf((long)(Math.pow(10, i))));
			factnum = factnum.subtract(BigInteger.valueOf((long)(Math.pow(10, i))).multiply(sumnum));
			realsumnum += sumnum.intValue();
		}
		System.out.println(realsumnum);
		
	}

	public static BigInteger factorial(BigInteger factnum) {
		if (factnum.equals(BigInteger.ONE)) {
			return factnum;
		} else {
			return factnum.multiply(factorial(factnum.subtract(BigInteger.ONE)));
		}
	}
}

/*
 * n! 이라는 표기법은 n × (n − 1) × ... × 3 × 2 × 1을 뜻합니다. 예를 들자면 10! = 10 × 9 × ... ×
 * 3 × 2 × 1 = 3628800 이 되는데, 여기서 10!의 각 자리수를 더해 보면 3 + 6 + 2 + 8 + 8 + 0 + 0 =
 * 27 입니다.
 * 
 * 100! 의 자리수를 모두 더하면 얼마입니까?
 */