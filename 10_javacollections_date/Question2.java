package com.company;

import java.util.*;

public class Question2 {
    public static int fun(String str){
        Map<Character, Integer> mymap= new HashMap<Character, Integer>();
        int unique=0;
        for(int i=0; i<str.length();i++)
        {
            if(mymap.get(str.charAt(i))==null)
                mymap.put(str.charAt(i),1);
            else {
                mymap.put(str.charAt(i),mymap.get(str.charAt(i))+1);
            }
        }
        return mymap.size();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str1=sc.next();
        System.out.println(fun(str1));
    }
}
