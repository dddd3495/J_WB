package workbook.StepA;

import java.util.Scanner;

public class A2 {
	
	private double c_degree;
	private double f_degree;

	public A2() {input();}
	public void printA2() {
		System.out.printf("ȭ���µ��� %.1f�� �Դϴ�.\n",output());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�����µ��� �Է��ϼ���.\n");
		this.c_degree = s.nextDouble();
		
	}
	double output() {
		this.f_degree = c_degree *1.8 + 3.2;
		return this.f_degree;
	}

		

}
