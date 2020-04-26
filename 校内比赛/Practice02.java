/* 
 * 一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的，
 * 例如"aaabbaaac"是由碎片组成"aaa"，"bb"，"c"。
 * 若给定一个字符串，则计算其所有碎片的平均长度，例如"aaabbaaac"的碎片平均长度=(3+2+3+1)/4，即2.25。
*/
package Practice;

import java.util.Scanner;//通过scanner类来获取用户的输入

public class Practice02 {
	public static void main(String[] args) {
		double count=1,result;
		
		//接收用户输入
		System.out.println("请输入一个字符串");
		Scanner input=new Scanner(System.in);
		String string=null;
		string=input.nextLine();

		//统计字符串中，字符变化的次数		
		char s=string.charAt(0);//返回字符串里的第一个字符
		for(int i=0;i<string.length();i++) {
			if(s!=string.charAt(i)) {
				s=string.charAt(i);
				count++;
			}
		}
		//计算结果并输出
		result=string.length()/count;
		System.out.printf("%.2f", result);
	}
}
