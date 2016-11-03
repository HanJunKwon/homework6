package homework6;
import java.util.Scanner;

public class StudentScore {
	int[][] student_report = new int[5][4]; // student_report[i][3] = sum
	int[] subject_sum={0,0,0}; //subject[0]:국어, subject[1]:영어, subject[2]:수학
	
	public void StuScore(){
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; ++i){
			student_report[i][3]=0;
			System.out.printf("%d번 학생 국어,영어,수학 : ", i+1);
			for(int j=0; j<3; ++j){
				student_report[i][j]=sc.nextInt();
				student_report[i][3]+=student_report[i][j];
			}
		}
		
		Subject_SumScore();
		
		korSumAvg_Print();
		EngSumAvg_Print();
		MathSumAvg_Print();
	
		Student_ReportResult();
	}
	
	public void Subject_SumScore(){
		for(int i=0; i<3; ++i){
			for(int j=0; j<5; ++j)
				subject_sum[i]+=student_report[j][i];
		}
	}
	
	public void korSumAvg_Print(){
		System.out.printf("국어 총점은 %d점이고, 평균은 %.1f 입니다\n",subject_sum[0],subject_sum[0]/5.0);
	}
	
	public void EngSumAvg_Print(){
		System.out.printf("국어 총점은 %d점이고, 평균은 %.1f 입니다\n",subject_sum[1],subject_sum[1]/5.0);
	}
	
	public void MathSumAvg_Print(){
		System.out.printf("국어 총점은 %d점이고, 평균은 %.1f 입니다\n",subject_sum[2],subject_sum[2]/5.0);
	}
	
	public void Student_ReportResult(){
		for(int i=0; i<5; ++i){
				System.out.printf("%d번 학생의 총점은  %d점이고, 평균은 %.1f이다.\n", i+1, student_report[i][3], student_report[i][3]/3.0);
		}
	}
}
