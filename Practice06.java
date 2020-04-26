/*
 * 某人有5张3分和4张5分的邮票，计算由这些邮票中的1张或若干张可以得到多少种不同的邮资，并按照邮资从小到大顺序显示。
 */
package Practice;

public class Practice06{  
    public static void main(String[] args){          
       int count =0;
       int a[]=new int[50];
       int result;//存放邮资
       int temp;//排序交换数值时用到的瓶子
       
       //计算邮资，放入数组
       for(int i=0;i<6;i++) {
           for(int j=0;j<5;j++){
        	   if(i==0&&j==0)
        		   continue;
        	   else {
	        	   result =3*i+5*j;                
		           a[count]=result;
		           count++;
        	   }
           } 
       }
       
       //冒泡排序
       for(int i=0;i<count-1;i++) {
    	   for(int j=0;j<count-1-i;j++) {
    		   if(a[j]>a[j+1]) {
    			   temp=a[j];
    			   a[j]=a[j+1];
    			   a[j+1]=temp;
    		   }
    	   }
       }
       
       //输出
       System.out.println("共有"+count+"种情况");
       for(int x=0;x<count;x++) {
    	   System.out.printf("第%d钟情况为：%d\n",x+1,a[x]);
       }
    	   
   }
}