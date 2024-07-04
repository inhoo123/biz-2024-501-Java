package com.callor.hello;

/*
 * 10~50 범위의 임의 Random 정수 1개를 생성하고
 * 생성한 Random 수 만큼의 정수형 배열을 선언하고
 * 배열의 각 요소에 1~100까지 범위의 Random 수를 저장
 * 배열에 저장된 값을 출력
 */
public class HelloJ {
	public static void main(String[] args) {
		int randomNum = (int) ((Math.random() * 41) + 10);
		System.out.println(randomNum);
		double nums[] = new double[randomNum];

		double sum = 0;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 100) + 1);
			System.out.print("번호:" + (i + 1) + "값:" + nums[i]);
			sum += nums[i];
		}
		double average = sum / nums.length;
		double a
		=Math.round((average) * 1);
		System.out.println("\n" + "=".repeat(30));
		System.out.println("합계 : " + sum);
		System.out.println("평균 :" + a);
		// 생산된 nums 의 요소들 전체를 합산하고, 평균을 계산하여 출력

	}

}
