package com.callor.hello;

/*
 * 정수형 배열 100개를 선언하고
 * 0 번 배열 부터 1~100까지 정수를 저장하기
 */
public class HelloH {
	public static void main(String[] args) {
		
		int numbers[] = new int[100];
		for (int i = 0; i < 100; i++) {
			numbers[i]=i+1; 
			System.out.println(numbers[i]);
		}
	}
}
