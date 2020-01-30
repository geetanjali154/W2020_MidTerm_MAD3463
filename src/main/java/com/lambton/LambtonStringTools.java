/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        int c=1;
        int j=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' )
                c++;
        }
        String s1[]=new String[c];
        String s2="";
        for(int i=0;i<s1.length;i++)
        {
            s1[i]="";
            while(j<s.length())
            {
                if(s.charAt(j)!=' ')
                {
                    s1[i]=s1[i]+s.charAt(j);
                }
                else
                    break;
            }j++;
        }
        for(int i=s1.length;i>=0;i--)
        {
            s2=s2+s1[i]+" ";
        }
        
    return s2;}
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        return null;

    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        return null;
    }
}
