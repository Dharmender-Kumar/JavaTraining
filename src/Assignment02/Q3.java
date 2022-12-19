package Assignment02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0;i<s.length();i++){

        }
        int idx = s.indexOf("done");

        System.out.println( s.charAt(0) == s.charAt(idx - 1) ? "yes" : "NO");
    }
}
