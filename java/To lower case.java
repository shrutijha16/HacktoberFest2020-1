class Solution {
    public String toLowerCase(String str) {
     char ch=str.charAt(0);
        String ans="";
       for(int i=0;i<str.length();i++){
        ch=str.charAt(i);
           if(Capital(ch)){
        ans=ans+(char)('a'+ch-'A');
        }
           else ans=ans+(char)(ch);
       }
       return ans; 
    } 
    public boolean Capital(char ch){
     int val=(int)ch;
    return (val>=65 && val<=90);
    }
}


    
