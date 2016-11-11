package homework6;

import java.util.Scanner;

public class OnlyNumber {
	int[] number = new int[10];
	int count = 0;

	public void InputNumber() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1~100사이의 숫자를 입력하세요");

		while (count < 10) {
			System.out.printf("%d번째 숫자 : ", count + 1);
			int n = sc.nextInt();

			if (n < 1 || n > 100)
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
			else {
				if (RedundancyCheck(n))
					number[count++] = n;
			}

		}

		System.out.println("============================");
		for (int i = 9; i >= 0; --i)
			System.out.printf("%d번째 숫자는 %d입니다.\n", i + 1, number[i]);
	}

	public boolean RedundancyCheck(int n) {
		for (int i = 0; i < count + 1; ++i) {
			if (number[i] == n) {
				System.out.println("잘못 입력하였습니다. 다시 입력하세요");
				return false;
			}
		}
		return true;
	}
}
