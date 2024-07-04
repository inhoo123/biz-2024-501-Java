package com.callor.hello;

/*
 * prime(int num) method 를 생성하고
 * 매개변수로 전달받은 num 의 값이 소수 인지 판별하여
 * 결과를 return 하기 
 */
public class HelloE {

	private static boolean prim(int num) {

		if (num <= 1) {
			return false;
		}
		if (num == 2) {
			return true;
		}
		if (num % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 7;
		boolean isPrime = prim(num);
		System.out.println(num + "는 소수입니까?" + isPrime);

	}
}
