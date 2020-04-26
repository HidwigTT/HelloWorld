/*
 * 楼梯有N阶，上楼可以一步上一阶，也可以一步上二阶。计算共有多少种不同的走法。
 */
package Practice;

import java.util.Scanner;

public class Practice07{
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.println("请输入台阶层数：");
		int n=input.nextInt();
		System.out.printf("总共有%d种方法",climb(n));
	}
	public static int climb(int n) {
		//只剩下1楼有一种走法，只剩2楼有2种走法
		if(n==1||n==2) {
			return n;
		}
		else {
			return climb(n-1)+climb(n-2);
		}
	}
}