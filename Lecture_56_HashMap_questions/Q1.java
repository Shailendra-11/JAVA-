
// Cheak wheather two String are anagram of each other .Return ture if they are else return false.
// An anagram of a string is another string that conatins the same charracters , only the order of characters can be 
// different . for example ,"abcd" and "dabc" are an anagram of each other
import java.util.*;

public class Q1 {

    public static HashMap<Character, Integer> makeFreMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int currfreq = mp.get(ch);
                mp.put(ch, currfreq + 1);
            }
        }
        return mp;
    }

    public static boolean isAnargram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mp1 = makeFreMap(s);
        HashMap<Character, Integer> mp2 = makeFreMap(t);
        return mp1.equals(mp2);

    }

    // 2end method
    public static boolean isAnargram2(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mp =new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (!mp.containsValue(ch)) return false;
                int currf = mp.get(ch);
                mp.put(ch, currf -1);
            
        }
        // All value in mp shoult
        for (Integer i : mp.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(" 1 mtehod " + isAnargram(s, t));
        System.out.println(" 2 method " + isAnargram2(s, t));

    }
}
