//����1 + 2! + 3! + �� + 10!�ĺ͡�
package Practice;

public class Practice01 {
	public static void main(String[] args){
	int result;
	result=factorial();
	System.out.printf("1��10�Ľ׳�֮��Ϊ��%d",result);
	}
	public static int factorial() {
		int i;//�׳˱�������ʼ��i�Ľ׳�
		int t=1;//tΪ�׳�ֵ��i�Ľ׳�Ϊ��
		int s=1;//sΪ�׳˵ĺ�
		for(i=1;i<=10;i++) {
			t=t*i;
			s+=t;
		}
		return s;
	}
}
