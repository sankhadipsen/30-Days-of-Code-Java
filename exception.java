import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            int S = Integer.parseInt(in.next());
            System.out.println(S);
            in.close();
        }catch(NumberFormatException e){
            System.out.println("Bad String");    
        }
    }
}
