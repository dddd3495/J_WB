package workbook.StepA;

import java.util.Scanner;

public class A3 {
	
	private int width;
	private int height;
	private int area;

	public A3() {input();}
	public void printA3() {
		System.out.printf("���簢���� ���̴� %d �Դϴ�.\n",output());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���簢���� ����ũ�⸦ �Է��ϼ���.\n");
		this.width = s.nextInt();
		System.out.printf("���簢���� ��ũ�⸦ �Է��ϼ���.\n");
		this.height = s.nextInt();
		
		
	}
	double output() {
		this.area = this.width * this.height;
		return this.area;
	}

		

}
