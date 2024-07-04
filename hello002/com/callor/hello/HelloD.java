package com.callor.hello;

/*
 * 1~100까지 정수중
 * 짜수들의 전체 합을 계산하여 출력하기
 * 
 */
public class HelloD {
	public static void main(String[] args) {
		int answer = 0;
		for (int i = 0; i <= 100; i++) {
			int num = i + 1;
			if (num % 2 == 0) {
				answer += num;
			}
		}
		System.out.println(answer);
	}
}