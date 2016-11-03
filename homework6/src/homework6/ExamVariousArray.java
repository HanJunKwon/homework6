package homework6;

import java.util.Scanner;

public class ExamVariousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1. 두번쨰로 큰 수 찾기");
			System.out.println("2. 심사 점수 계산");
			System.out.println("3. 학생 총점, 평균값 구하기");
			System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
			System.out.println("5. 겹치지 않는 숫자 10개입력받기");
			System.out.println("6. 종료하기");
			System.out.print("원하는 메뉴는 >> ");
			int sel=sc.nextInt();
			
			if(sel==1)
				new SecondMax().Second();
			else if(sel==2)
				new AvgScore().Avg();
			else if(sel==3)
				new StudentScore().StuScore();
			else if(sel==4)
				new AptPersonCount().pCount();
		}
	}
}
