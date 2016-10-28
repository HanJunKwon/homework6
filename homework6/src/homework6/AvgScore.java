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
			for(int j=i; j<10; ++j){
				if(arr[i]>arr[i+1])
			}
		}
	}
}
