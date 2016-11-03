package homework6;

import java.util.Scanner;

public class AvgScore {
	public void Avg(){
		double[] arr = new double[10];
		double sum=0;
		
		double max=Double.MIN_VALUE;
		double min=Double.MAX_VALUE;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; ++i){
			System.out.print(i+1+"번 심사 점수 입력:");
			arr[i] = sc.nextDouble();
		}
		
		for(int i=0; i<10; ++i){
			for(int j=0; j<9-i; ++j){
				if(arr[j]<arr[j+1]){
					double temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				else continue; 
			}
		}
		
		for(int i=1; i<9; ++i)
			sum+=arr[i];
		System.out.printf("가장 큰 저매수와 가장 작은 점수를 제외한\n8개의 점수 평균은 %.1f입니다\n",sum/8);
	}
}
