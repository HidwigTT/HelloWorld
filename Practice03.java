/*
 *  �ڴ�����������ʱ��Ҫ���ܣ����ܵĹ������£�ÿ4λ������Ϊһ���ֶν��м��ܣ�����ÿλ���ֶ�����5��
 *  Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
 */
package Practice;

import java.util.Scanner;

public class Practice03{
	public static void main(String[] args) {
		int code;
		System.out.println("��������Ҫ���ܵ�4λ���֣�");
		Scanner input=new Scanner(System.in);
		code=input.nextInt();
		System.out.printf("���ܺ�Ľ���ǣ�%d",encode(code));
	}
	
	public static int encode(int num) {
		String nums=num+"";//�����ε�numת�����ַ��͵�nums
		int newNum=(nums.charAt(3)-'0'+5)%10*1000
				+(nums.charAt(2)-'0'+5)%10*100
				+(nums.charAt(1)-'0'+5)%10*10
				+(nums.charAt(0)-'0'+5)%10;
		return newNum;
	}
}

