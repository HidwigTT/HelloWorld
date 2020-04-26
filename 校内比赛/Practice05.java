/*
 * 输出一个4×4方阵，方阵中的数据由1~8之间的数字组成，要求1~8中的每个数在方阵中恰好出现两次，出现的位置是随机的。
 */
package Practice;

public class Practice05 {
	public static void main(String[] args) {
		int[] a=new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int n;//存储生成的随机数
		int i;//循环变量
		int count=0;//存储随机数n出现的次数
		int j=0;//数存入数组的位置
		
		//生成一个随机数,当数组填满时结束
		while(a[15]==0){
			n=(int)(Math.random()*8+1);
			//遍历判断该数是否出现了2次
			for(i=0;i<16;i++) {
				if(n==a[i])
					count++;
			}
			//如果没有,count清零输入数组
			if(count<2) {
				count=0;
				a[j]=n;
				j++;
			}
			//如果有，count清零返回第一步
			else {
				count=0;
				continue;
			}
		}
		//输出数组
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+"\n"+a[4]+" "+a[5]+" "+a[6]+" "+a[7]+"\n"+a[8]+" "+a[9]+" "+a[10]+" "+a[11]+"\n"+a[12]+" "+a[13]+" "+a[14]+" "+a[15]);
	}
}