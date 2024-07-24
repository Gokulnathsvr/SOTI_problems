package SOTI_probs;

//Valid_Anagram Leetcode 242

import java.util.Arrays;
import java.util.Scanner;

public class Valid_Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        boolean res = isAnagram(s1, s2);
        System.out.println(res);
    }
    public static boolean isAnagram(String s1,String s2){
        char[] s1Chars = s1.toLowerCase().toCharArray();
        char[] s2Chars = s2.toLowerCase().toCharArray();

        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);

        return Arrays.equals(s1Chars, s2Chars);
    }
}

