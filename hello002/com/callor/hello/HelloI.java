package com.callor.hello;

/*
 * 정수형 배열 100개를 선언하고,
 * 1~100 Random 수를 생성하여 배열 100개에 할당하기
 */
public class HelloI {
	public static void main(String[] args) {
		//배열에 임의 정수를 할당하는 block
		int numbers[] = new int[100];
		for (int i = 0; i < 100; i++) {
			numbers[i]=((int) (Math.random()*100 + 1));
		}
		
	}
}
