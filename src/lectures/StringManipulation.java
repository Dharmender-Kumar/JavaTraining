package lectures;

import java.util.HashMap;
import java.util.Scanner;

public class StringManipulation {

//    13-DEC
    static void immuatableString(){
        String fn = "deku";
        String ln = "sharma";
        //string is immutable
        fn=fn.concat(ln);
        System.out.println(fn);
        for(int i=0;i<fn.length();i++){
            System.out.print(fn.charAt(i));
        }
        System.out.print(" ");
        for(int i=0;i<ln.length();i++){
            System.out.print(ln.charAt(i));
        }
    }
    public static void removeDuplicacy(String s){
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        String res="";
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), 1);
                res+=s.charAt(i);
            }
        }
        System.out.println(res);
    }
    static void longestString(String s){
        int ans = 0;
        String res = "";
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), 1);
                res+=s.charAt(i);
            }else{
                ans = Math.max(ans,res.length());
                res = "";
                res+=s.charAt(i);
                hm.clear();
                hm.put(s.charAt(i),1);
            }
        }
        ans = Math.max(ans,res.length());
        System.out.println(ans);
    }

    static void removeWhiteSpaces(String s){
        String[] ns = s.split(" ");
        for(int i=0;i<ns.length;i++){
            System.out.print(ns[i]);
        }
    }
    static void replaceWithOcuurances(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }else{
//                System.out.println("yes");
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<s.length();i++){
            System.out.print(hm.get(s.charAt(i)));
        }
    }
    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }

//    14-DEC

    void Stingx(){
//        scp - string constant pool (for fututre
//        heap;=
        String s = new String("Hello");
        s.replace("ell","x");
        String s1 = new String("Hello");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        StringBuffer sb = new StringBuffer("h");
        StringBuffer sb1 = new StringBuffer("h");
        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));

//        final for variables
//        immutable for objects

    }
    void finalism(){
        final StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);
//        sb = new StringBuffer("monday"); -- sb is final
        final String s = "hell";
//        s=s.concat("x"); -- s is final
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();

//      un synchronised methods in string builder
        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("hello");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        Thread t1 = new Thread();
        String s = new String("Hello");
        s=s.replace("ell","x");
        System.out.println(s);




    }
}
