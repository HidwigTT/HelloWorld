/* 
 * һ����Сд��ĸ��ɵ��ַ������Կ���һЩͬһ��ĸ�������Ƭ��ɵģ�
 * ����"aaabbaaac"������Ƭ���"aaa"��"bb"��"c"��
 * ������һ���ַ������������������Ƭ��ƽ�����ȣ�����"aaabbaaac"����Ƭƽ������=(3+2+3+1)/4����2.25��
*/
package Practice;

import java.util.Scanner;//ͨ��scanner������ȡ�û�������

public class Practice02 {
	public static void main(String[] args) {
		double count=1,result;
		
		//�����û�����
		System.out.println("������һ���ַ���");
		Scanner input=new Scanner(System.in);
		String string=null;
		string=input.nextLine();

		//ͳ���ַ����У��ַ��仯�Ĵ���		
		char s=string.charAt(0);//�����ַ�����ĵ�һ���ַ�
		for(int i=0;i<string.length();i++) {
			if(s!=string.charAt(i)) {
				s=string.charAt(i);
				count++;
			}
		}
		//�����������
		result=string.length()/count;
		System.out.printf("%.2f", result);
	}
}
