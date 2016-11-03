package homework6;

import java.util.Scanner;

public class OnlyNumber {
	int[] number = new int[10];

	public void InputNumber() {
		int count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("1~100사이의 숫자를 입력하세요");

		while (count<10) {
			System.out.printf("%d번째 숫자 : ",count+1);
			int n = sc.nextInt();
			if (RedundancyCheck(count, n))
				number[count++] = n;

			else {
				System.out.println("잘못 입력하였습니다. 다시 입력하세요");
				continue;
			}
		}
		
		System.out.println("============================");
		for(int i=9; i>=0; --i)
			System.out.printf("%d번째 숫자는 %d입니다.\n", i+1, number[i]);
	}

	public boolean RedundancyCheck(int count, int n) {
		for (int i = 0; i < count + 1; ++i) {
			if (number[i] == n)
				return false;
		}
		return true;
	}
}
