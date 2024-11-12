class Solution {
    public boolean isPalindrome(int x) {
        int n=0;
        int t=x;
        if(x<0||(x%10==0&&x!=0)) return false;
        while(x>0)
        {
            n=n*10+x%10;
            x=x/10;
        }
        if(t==n) return true;
        else return false;
        
    }
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Solution s= new Solution();
        if(s.isPalindrome(n)) System.out.println("true");
        else System.out.println("false");        
    }
}
