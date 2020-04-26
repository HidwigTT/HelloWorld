//计算1 + 2! + 3! + … + 10!的和。
package Practice;

public class Practice01 {
	public static void main(String[] args){
	int result;
	result=factorial();
	System.out.printf("1到10的阶乘之和为：%d",result);
	}
	public static int factorial() {
		int i;//阶乘变量，开始求i的阶乘
		int t=1;//t为阶乘值，i的阶乘为几
		int s=1;//s为阶乘的和
		for(i=1;i<=10;i++) {
			t=t*i;
			s+=t;
		}
		return s;
	}
}
