class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c =0;
        for(String operation:operations)
        {
            if(operation.equals("X++")||operation.equals("++X"))c++;
            else c--;
        }
        return c;
        
    }
}
