/*
 * ���ַ����в������ظ��ַ�����Ӵ��ĳ���
 */
package Practice;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Practice08 {
	public static void main(String arg[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s=input.nextLine();
		System.out.printf("��Ӵ��ĳ�����:%d", lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s) {   
		char[] ss = s.toCharArray();//���ַ���sת��Ϊ�ַ�����ss
		int n = ss.length;//nΪ����ss�ĳ���
		int ans = 0;//ansΪ��󷵻صĳ��Ƚ��
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0,j = 0;j < n;j++){//j�����������飬i����ʱ�̱������µ�ǰ�Ӵ�����ʼ
			if(map.containsKey(ss[j])){//containsKey�����ж�Map���Ƿ�����ü�
				i = Math.max(map.get(ss[j]),i);//�Ƚ�������ͬ���Ͳ����Ĵ�С
		    }      
		    ans = Math.max(ans,j-i+1);
		    map.put(ss[j],j+1);       
		}
		return ans;
	}
}
