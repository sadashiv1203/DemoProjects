package com.spring;

//You are given a string  of length   . The string  consists of digits from 1-9. Consider the string indexing to be 1-based.
//You need to divide the string into blocks such that the   block contains the elements from the index to  (both inclusive). A number is valid if it is formed by choosing exactly one digit from each block and placing the digits in the order of their block number.

//For example:

//If the given string is '123456789' and X=3, the blocks formed are [123], [456], [789]. Few valid numbers are 147,159,348 etc.. but 124 and 396 are invalid.

//Among all the valid numbers that can be formed, your task is to determine the number if all the unique valid numbers are sorted in ascending order.

import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
       // String in_ = Integer.parseInt(br.readLine().trim());
         int N = sc.nextInt();
         int X = sc.nextInt();
         long K = sc.nextLong();
         String S = sc.next();
         String out_ = Find_It(X, K, S, N);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
    static String Find_It(int x, long k, String s, int n){
        ArrayList<ArrayList<Integer>> temp=new ArrayList<>();
        for(int i=0;i<s.length();)
        {   HashSet<Integer> set=new HashSet<>();
            int z=i;
            for(int j=i;j<Math.min(s.length(),z+x);j++,i++)
               set.add(s.charAt(i)-'0');
            ArrayList<Integer> arr=new ArrayList<>(set);
            Collections.sort(arr);
            temp.add(arr);
            //System.out.println(arr);
        }
        k--;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=temp.size()-1;i>=0;i--)
        {
            int z=temp.get(i).size();
            int zz=temp.get(i).get((int)(k%z));
            ans.add(zz);
            k/=z;
        }
        Collections.reverse(ans);
        //System.out.println(ans);
        String temp3="";
        for(int c:ans)
            temp3+=Integer.toString(c);
        //System.out.println(temp);
        return temp3;
    }
}