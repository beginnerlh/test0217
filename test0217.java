/*
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。

示例:

输入: s = "abcdefg", k = 2
输出: "bacdfeg"
*/
package lianxi0217;

public class test0217 {
	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		Solution S = new Solution();
		String s1 = S.reverseStr(s, k);
		System.out.println("变换后的字符串："+s1);
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
            if(flag==1)  //用flag作为判断条件，每过2  * k个字符旋转一次
            {
                swap(ch,i,len,k);
            }
        
            flag = 1-flag;  //让flag在1和0之间相互转换，
        }
        return new String(ch);
}


    public void swap(char[] ch,int i,int len,int k)
    {    
    	if(i+k-1<len)   //剩余的字符数量比 k多
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
    	else       //剩余字符数不够 k个，将剩余字符全部反转
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