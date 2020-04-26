/*
 *  在传递数字数据时需要加密，加密的规则如下：每4位数字作为一个分段进行加密，其中每位数字都加上5，
 *  然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 */
package Practice;

import java.util.Scanner;

public class Practice03{
	public static void main(String[] args) {
		int code;
		System.out.println("请输入需要加密的4位数字：");
		Scanner input=new Scanner(System.in);
		code=input.nextInt();
		System.out.printf("加密后的结果是：%d",encode(code));
	}
	
	public static int encode(int num) {
		String nums=num+"";//将整形的num转换成字符型的nums
		int newNum=(nums.charAt(3)-'0'+5)%10*1000
				+(nums.charAt(2)-'0'+5)%10*100
				+(nums.charAt(1)-'0'+5)%10*10
				+(nums.charAt(0)-'0'+5)%10;
		return newNum;
	}
}

