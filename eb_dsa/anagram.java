class Solution {
    public boolean isAnagram(String s, String t) {
        int a=0;
        if(s.length()!=t.length()) return false;
        else {
            char sa[] = s.toCharArray();
            char ta[] = t.toCharArray();
            Arrays.sort(sa);
            Arrays.sort(ta);
            return Arrays.equals(sa,ta);
        }
      
    }
        
    
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        Solution sol = new Solution();
        String s = obj.next();
        String  t= obj.next();
        if(sol.isAnagram(s,t))
        {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
