/*
 * ĳ����5��3�ֺ�4��5�ֵ���Ʊ����������Щ��Ʊ�е�1�Ż������ſ��Եõ������ֲ�ͬ�����ʣ����������ʴ�С����˳����ʾ��
 */
package Practice;

public class Practice06{  
    public static void main(String[] args){          
       int count =0;
       int a[]=new int[50];
       int result;//�������
       int temp;//���򽻻���ֵʱ�õ���ƿ��
       
       //�������ʣ���������
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
       
       //ð������
       for(int i=0;i<count-1;i++) {
    	   for(int j=0;j<count-1-i;j++) {
    		   if(a[j]>a[j+1]) {
    			   temp=a[j];
    			   a[j]=a[j+1];
    			   a[j+1]=temp;
    		   }
    	   }
       }
       
       //���
       System.out.println("����"+count+"�����");
       for(int x=0;x<count;x++) {
    	   System.out.printf("��%d�����Ϊ��%d\n",x+1,a[x]);
       }
    	   
   }
}