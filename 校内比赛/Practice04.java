/*
 * ��һ��������N��N��1000���ֽ������������磺����90,��ӡ��90=2*3*3*5��
 */
package Practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String args[]) {
    	int n,i;//n��Ҫ�ֽ������i������
    	
    	//���ռ��̼��������
    	Scanner input=new Scanner(System.in);
    	System.out.println("������Ҫ�ֽ��������");
    	n=input.nextInt();
    	System.out.printf("%d=",n);
    	
    	//�ֽ�Ĺ���,forѭ���޸�i��ֵ����n��������iʱ�����޸�n��ֵ�����i
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
