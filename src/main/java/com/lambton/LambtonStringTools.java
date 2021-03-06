/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import com.sun.deploy.security.SelectableSecurityManager;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools {
    //1 - REVERSE STRING
    public static String reverse(String s) {
        if (s.equals("null")) {
            return "null";
        }
        int c = 1;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                c++;
        }
        String s1[] = new String[c];
        String s2 = "";
        for (int i = 0; i < s1.length; i++) {
            s1[i] = "";
            while (j < s.length()) {
                if (s.charAt(j) != ' ') {
                    s1[i] = s1[i] + s.charAt(j);
                } else
                    break;
            }
            j++;
        }
        for (int i = s1.length; i >= 0; i--) {
            s2 = s2 + s1[i] + " ";
        }

        return s2;
    }

    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) {
        if (s.equals(null)) {
            return "null";
        }

        int c = 1;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                c++;
        }
        if (c != 3)
            return null;

        String s1[] = new String[c];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = "";
            while (j < s.length()) {
                if (s.charAt(j) != ' ') {
                    s1[i] = s1[i] + s.charAt(j);
                } else
                    break;
            }
            j++;
        }


        String a = s1[1].charAt(1) + "." + " " + s1[2].charAt(2) + "." + " " + s1[3];
        a = a.toUpperCase();
        return a;


    }

    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) {
        if (s.equals(null)) {
            return "null";
        }
        int c = 0;
        int b = 0;
        String frequent = "";

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (a == s.charAt(i)) {
                    c++;

                } else {
                    continue;
                }
            }
            if (c > b) {
                frequent = "";
                frequent = frequent + s.charAt(i);
            }

        }
        return frequent;
    }


    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) {
        return 0;
    }

    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) {
        if (originalString.equals(null)) {
            return "null";
        }
        int c = 1;
        int j = 0;

        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) == ' ')
                c++;
        }
        String s1[] = new String[c];
        String s2 = "";
        for (int i = 0; i < s1.length; i++) {
            s1[i] = "";
            while (j < originalString.length())
            {
                if (originalString.charAt(j) != ' ')
                {
                    s1[i] = s1[i] + originalString.charAt(j);
                } else
                    break;
            }j++;

        }
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(findString))
            {
                s1[i] = new String(newString);
            }
            s2 = s2.concat(s1[i]);
        }
        return s2;

    }
}
