/*
 * 将一个正整数N（N≤1000）分解质因数。例如：输入90,打印出90=2*3*3*5。
 */
package Practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String args[]) {
    	int n,i;//n是要分解的数，i是因数
    	
    	//接收键盘键入的整数
    	Scanner input=new Scanner(System.in);
    	System.out.println("请输入要分解的整数：");
    	n=input.nextInt();
    	System.out.printf("%d=",n);
    	
    	//分解的过程,for循环修改i的值，当n可以整除i时，就修改n的值并输出i
    	for(i=2;i<=n;i++) {
    		while(n%i==0) {
    			n/=i;
    			if(n==1)
    				System.out.printf("%d",i);
    			else
    				System.out.printf("%d*",i);
    		}
    	}
    }
}
