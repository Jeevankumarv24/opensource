class Solution {
    public void reverseString(char[] s) {
        char t[] = new char[s.length];
        int l = s.length;
        for(int i=0;i<l/2;i++)
        {
            char temp = s[i];
            s[i] = s[l-1-i];
            s[l-1-i]= temp;
        }
        
                
    }
}
