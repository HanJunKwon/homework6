package homework6;

import java.util.Scanner;

public class AptPersonCount {
	// 각 층 호실별 인원수 저장
	int[] firstFloor=new int[3];  
	int[] secondFloor=new int[3]; 
	int[] thirdFloor=new int[3];
	int[] fourthFloor=new int[3]; 
	int[] fifthFool=new int[3];
	
	// 모든 층의 각라인별 인원수 저장
	int[] roomLine=new int[3]; 
	
	// 각 층의 인원수 저장
	int[] floor_Sum=new int[5];
	
	//아파트 총 인원수
	int aptSum=0;
	
	public void pCount(){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; ++i){
			System.out.printf("10%d호에 살고 있는 사람의 숫자 : ", i+1);
			firstFloor[i]=sc.nextInt();
		}
		for(int i=0; i<3; ++i){
			System.out.printf("20%d호에 살고 있는 사람의 숫자 : ", i+1);
			secondFloor[i]=sc.nextInt();
		}
		for(int i=0; i<3; ++i){
			System.out.printf("30%d호에 살고 있는 사람의 숫자 : ", i+1);
			thirdFloor[i]=sc.nextInt();
		}
		for(int i=0; i<3; ++i){
			System.out.printf("40%d호에 살고 있는 사람의 숫자 : ", i+1);
			fourthFloor[i]=sc.nextInt();
		}
		for(int i=0; i<3; ++i){
			System.out.printf("50%d호에 살고 있는 사람의 숫자 : ", i+1);
			fifthFool[i]=sc.nextInt();
		}
		
		FloorSum();
		AptSumPerson();
		LineSum();

		System.out.printf("이 아파트의 거주자는 모두 %d 명입니다.\n",aptSum);
		
		for(int i=0; i<5; ++i)
			System.out.printf("%d층에 사는 거주자는 모두 %d명입니다.\n", i+1, floor_Sum[i]);
		
		for(int i=0; i<3; ++i)
			System.out.printf("%d호 라인에 사는  거주자는 모두 %d명\n", i+1, roomLine[i]);
	}
	
	// 층 별 인원수 합계
	public void FloorSum(){
		for(int i=0; i<3; ++i){
			floor_Sum[0]+=firstFloor[i];
			floor_Sum[1]+=secondFloor[i];
			floor_Sum[2]+=thirdFloor[i];
			floor_Sum[3]+=fourthFloor[i];
			floor_Sum[4]+=fifthFool[i];
		}
	}
	
	//아파트 인원수 총합구하기
	public void AptSumPerson(){
		for(int i=0; i<5; ++i)
			aptSum+=floor_Sum[i];
	}
	
	// 같은 라인별 인원수
	public void LineSum(){
		for(int i=0; i<3; ++i){
			roomLine[i]+=firstFloor[i];
			roomLine[i]+=secondFloor[i];
			roomLine[i]+=thirdFloor[i];
			roomLine[i]+=fourthFloor[i];
			roomLine[i]+=fifthFool[i];
		}
	}
}
