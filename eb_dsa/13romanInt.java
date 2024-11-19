class Solution {
    public int romanToInt(String s) {
        int n =0;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                n =n+1;
            }
            else if(s.charAt(i)=='V')
            {
                n=n+5;
                if(i>0)
                {
                    if(s.charAt(i-1)=='I')
                    n=n-1-1;
                }
            }
            else if(s.charAt(i)=='X')
            {
                n=n+10;
                if(i>0)
                {
                    if(s.charAt(i-1)=='I')
                    n=n-1-1;
                }
            }
            else if(s.charAt(i)=='L')
            {
                n=n+50;
                if(i>0)
                {
                    if(s.charAt(i-1)=='X') n=n-10-10;
                    
                }
            }
            else if(s.charAt(i)=='C')
            {
                n=n+100;
                if(i>0)
                {
                    if(s.charAt(i-1)=='X')
                    {
                        n=n-10-10;
                    }
                }
            }
            else if(s.charAt(i)=='D')
            {
                n=n+500;
                if(i>0){
                if(s.charAt(i-1)=='C')
                {
                    n=n-100-100;
                }
                }
            }
            else if(s.charAt(i)=='M')
            {
                n= n+1000;
                if(i>0)
                {
                    if(s.charAt(i-1)=='C') n=n-100-100;
                }
            }

        }
        return n;
    }
}
