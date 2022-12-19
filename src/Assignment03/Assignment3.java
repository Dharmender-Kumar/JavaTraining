package Assignment03;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Assignment3 {

    static void q1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int k=0;k<n;k++) {
            arr[k]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==1){
                arr[i]=arr[j];
                arr[j]=1;
                j--;
            }else{
                i++;
            }
        }
        for(int k=0;k<n;k++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void q2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int k=0;k<n;k++) {
            arr[k]=sc.nextInt();
        }
        int k = sc.nextInt();

        k%=n;
        for(int i=0;i<n;i++){
            System.out.print(arr[(i+k)%n]);
        }

    }
    static void q3(int []arr,int n){
        int sm=Integer.MAX_VALUE,lg=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            sm=Math.min(sm,arr[i]);
            lg=Math.max(lg,arr[i]);
        }
        System.out.println("Smallest: "+sm+ " latgest: "+lg);
    }
    static void q4(int []arr,int n){
        Arrays.stream(arr).sorted();
        System.out.println(arr[1]+" "+arr[n-2]);
    }
    static void q5(int []arr,int a,int b,int n){
        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]==a){
                ar1.add(i);
            }
            if(arr[i]==b){
                ar2.add(i);
            }
        }
        int dist= Integer.MAX_VALUE;

        int i=0;
        int j=0;
        while(i<ar1.size() && j<ar2.size()){
            if(ar1.get(i)<ar2.get(j)){
                dist = Math.min(dist,ar2.get(j)-ar1.get(i));
                i++;
            }else j++;
        }
        System.out.println(dist);
    }

//Java Programs on Inserting & Deleting Elements from an Array.

    static void deleteAtPos(int []arr, int pos){
        int[] anotherArray = IntStream.range(0,arr.length)
                .filter(i->i!=pos-1)
                .map(i->arr[i])
                .toArray();
        for(int i=0;i<anotherArray.length;i++){
            System.out.print(anotherArray[i]+" ");
        }
    }
    static void insertAtPos(int []arr, int pos,int val){
        int n=arr.length;
        int newarr[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = val;
            else
                newarr[i] = arr[i - 1];
        }
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
//Java Program to Cyclically Permute the Elements of an Array
    static void cyclicShiftarray(int []arr,int n,int k){
        k%=n;
        for(int i=0;i<n;i++){
            System.out.print(arr[(i+k)%n]+" ");
        }
    }
// Java Program to Find the Missing Element in an Integer Array.
    static int missingNum(int []a,int n){
        int x1 = a[0];
        int x2 = 1;
        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;
        return (x1 ^ x2);
    }
//Java Program to Print All the Leaders in an Array
    static void leaders(int []arr,int n){
        ArrayList<Integer> res = new ArrayList<>();
        int i=n-1;
        res.add(arr[i]);
        int mx = arr[i];
        i--;
        while(i>=0){
            if(arr[i]>mx){
                res.add(arr[i]);
                mx=arr[i];
                i--;
            }else{
                i--;
            }
        }
        for( i=res.size()-1;i>=0;i--){
            System.out.print(res.get(i)+" ");
        }

    }

// Take an array as input from the user. Search for a given number x and print the index at which it occurs
    static void searchX(int []arr,int x,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println(x+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        q5(arr,2,5,n);
    }
}
