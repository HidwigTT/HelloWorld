/*
 * ¥����N�ף���¥����һ����һ�ף�Ҳ����һ���϶��ס����㹲�ж����ֲ�ͬ���߷���
 */
package Practice;

import java.util.Scanner;

public class Practice07{
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.println("������̨�ײ�����");
		int n=input.nextInt();
		System.out.printf("�ܹ���%d�ַ���",climb(n));
	}
	public static int climb(int n) {
		//ֻʣ��1¥��һ���߷���ֻʣ2¥��2���߷�
		if(n==1||n==2) {
			return n;
		}
		else {
			return climb(n-1)+climb(n-2);
		}
	}
}