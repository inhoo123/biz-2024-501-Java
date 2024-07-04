package com.callor.hello;

/*
 * main method() 를 선언하고
 * 정수 30과 40을 변수에 저장하고
 * 1. 정수 30과 40을 덧셈하고
 * 2. 정수 30과 덧셈한 결과를 뺄셈하고
 * 3. 정수 40과 뺄셈할 결과를 곱셈하고
 * 4. 덧셈한 결과와 뺄셈한 결과를 나눗셈
 * 
 */
public class HelloF {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		
		int answer1 = num1+num2;
		System.out.println(answer1);
		
		int plus = answer1+num1;
		int answer2 = answer1-plus;
		System.out.println(answer2);
		
		int minus = answer2 - num2;
		int answer3 = num2 * minus;
		System.out.println(answer3);
		
		int answer4 =answer2/answer3;
		System.out.println(answer4);
	}
}
