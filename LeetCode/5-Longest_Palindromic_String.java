/*
*
*Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
*
*Example 1:
*
*Input: "babad"
*Output: "bab"
*Note: "aba" is also a valid answer.
*Example 2:
*
*Input: "cbbd"
*Output: "bb"
**/

class Solution {
    public static int stringifPalindrome(String str,int l,int r){
		int len = str.length();
		while(l>=0 && r<len && str.charAt(l) == str.charAt(r)){
			l--;
            r++;
		}
		return r-l-1;
	}
    
    public String longestPalindrome(String s) {	
        if(s.length()<=0){
            return "";
        }
        int start=0;
        int end=0;
        int max=0;
        
        
        for(int i=0;i<s.length();i++){
        int len1 = stringifPalindrome(s,i,i);
        int len2 = stringifPalindrome(s,i,i+1);
        max = Math.max(len1,len2);
        if(max> end-start){ 
            start = i - (max-1)/2;
            end =  i + max/2;
        }     
        }       
   return s.substring(start,end+1);      
    }
}
