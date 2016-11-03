package homework6;
import java.util.Scanner;
public class SecondMax {
	public void Second(){
		int[] arr  = new int[10];
		
		int max = Integer.MIN_VALUE;
		int s_max = Integer.MIN_VALUE;
		int max_index=-1;
		int sMax_index=-1;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; ++i){
			System.out.print(i+1+"번째 수를 입력하시오.");
			arr[i] = sc.nextInt();
			
			if(arr[i]>max){
				s_max=max;
				max=arr[i];
				sMax_index=max_index;
				max_index=i;
			}
			else if(arr[i]>s_max){
				s_max=arr[i];
				sMax_index=i;
			}
		}
		
		System.out.println("두 번쨰로 큰 수는 "+(sMax_index+1)+"번째수 "+s_max+"입니다");
	}
}
