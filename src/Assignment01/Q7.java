package Assignment01;


import java.util.Scanner;

public class Q7 {

    static void solution(String s, int n){
        System.out.printf("%-15s",s);
        int digit = (int)(Math.log10(n))+1;
        if(n==0) System.out.println("000");
        else {
            if (digit < 3) {
                int count = (3 - digit);
                while (count > 0) {
                    System.out.print(0);
                    count--;
                }
            }
            System.out.print(n);
        }
        System.out.println("\n");

    }
    public static void main(String[] args) {
//        solution("hello",23);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String []str = new String[t];
        int []arr = new int[t];

        for(int i=0;i<t;i++){
            String s = sc.next();
            int n = sc.nextInt();
            str[i]= s;
            arr[i]= n;
        }
        for(int i=0;i<t;i++){
            solution(str[i],arr[i]);
        }


    }
}
