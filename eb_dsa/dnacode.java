import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        
        while(t-- > 0) {
            int n = obj.nextInt();
            String s = obj.next();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < n; i += 2) {
                String pair = s.substring(i, i + 2);
                switch(pair) {
                    case "00": result.append("A"); break;
                    case "01": result.append("T"); break;
                    case "10": result.append("C"); break;
                    case "11": result.append("G"); break;
                }
            }
            System.out.println(result.toString());
        }

        obj.close();
    }
}
