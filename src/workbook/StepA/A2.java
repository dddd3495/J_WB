package workbook.StepA;

import java.util.Scanner;

public class A2 {
	
	private double c_degree;
	private double f_degree;

	public A2() {input();}
	public void printA2() {
		System.out.printf("화씨온도는 %.1f도 입니다.\n",output());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("섭씨온도를 입력하세요.\n");
		this.c_degree = s.nextDouble();
		
	}
	double output() {
		this.f_degree = c_degree *1.8 + 3.2;
		return this.f_degree;
	}

		

}
