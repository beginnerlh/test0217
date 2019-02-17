/*
 * ����һ���ַ�����һ������ k������Ҫ�Դ��ַ�����ͷ�����ÿ�� 2k ���ַ���ǰk���ַ����з�ת�����ʣ������ k ���ַ�����ʣ�������ȫ����ת�������С�� 2k �����ڻ���� k ���ַ�����תǰ k ���ַ�������ʣ����ַ�����ԭ����

ʾ��:

����: s = "abcdefg", k = 2
���: "bacdfeg"
*/
package lianxi0217;

public class test0217 {
	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		Solution S = new Solution();
		String s1 = S.reverseStr(s, k);
		System.out.println("�任����ַ�����"+s1);
	}
}


class Solution {
	public String reverseStr(String s, int k) {
        if(s==null || k<=0) 
            return null; 
        int len = s.length();
        int flag = 1; 
        char[] ch = s.toCharArray(); 
        for(int i=0;i<len;i=i+k)
        { 
            if(flag==1)  //��flag��Ϊ�ж�������ÿ��2  * k���ַ���תһ��
            {
                swap(ch,i,len,k);
            }
        
            flag = 1-flag;  //��flag��1��0֮���໥ת����
        }
        return new String(ch);
}


    public void swap(char[] ch,int i,int len,int k)
    {    
    	if(i+k-1<len)   //ʣ����ַ������� k��
    	{
    		int j=i+k-1;      
    		while(i<j)       
    		{          
    			char tmp = ch[i];            
    			ch[i] = ch[j];         
    			ch[j] = tmp;          
    			i++;       
    			j--;     
    		}  
    	}  
    	else       //ʣ���ַ������� k������ʣ���ַ�ȫ����ת
    	{     
    		int j = len-1;       
    		while(i<j)        
    		{        
    			char tmp = ch[i];          
    			ch[i] = ch[j];           
    			ch[j] = tmp;           
    			i++;            
    			j--;
    		}
    	}
    }
}