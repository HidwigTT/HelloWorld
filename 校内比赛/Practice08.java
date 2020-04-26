/*
 * 求字符串中不包含重复字符的最长子串的长度
 */
package Practice;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Practice08 {
	public static void main(String arg[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s=input.nextLine();
		System.out.printf("最长子串的长度是:%d", lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s) {   
		char[] ss = s.toCharArray();//将字符串s转换为字符数组ss
		int n = ss.length;//n为数组ss的长度
		int ans = 0;//ans为最后返回的长度结果
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0,j = 0;j < n;j++){//j用来遍历数组，i用来时刻保存或更新当前子串的起始
			if(map.containsKey(ss[j])){//containsKey方法判断Map中是否包含该键
				i = Math.max(map.get(ss[j]),i);//比较两个相同类型参数的大小
		    }      
		    ans = Math.max(ans,j-i+1);
		    map.put(ss[j],j+1);       
		}
		return ans;
	}
}
