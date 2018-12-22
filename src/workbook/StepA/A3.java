package workbook.StepA;

import java.util.Scanner;

public class A3 {
	
	private int width;
	private int height;
	private int area;

	public A3() {input();}
	public void printA3() {
		System.out.printf("직사각형의 넓이는 %d 입니다.\n",output());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로크기를 입력하세요.\n");
		this.width = s.nextInt();
		System.out.printf("직사각형의 세크기를 입력하세요.\n");
		this.height = s.nextInt();
		
		
	}
	double output() {
		this.area = this.width * this.height;
		return this.area;
	}

		

}
