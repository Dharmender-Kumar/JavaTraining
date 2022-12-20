package Assignment02;


import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            System.out.println("First and Last Characters are not the same!");
        }
        else{
            System.out.println("First and Last Characters are the same!");
        }

    }
}