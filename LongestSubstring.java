package SOTI_probs;

//Longest Substring Without Repeating Characters

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
            String s = "abcabcbb";
            System.out.println("Input string: " + s);
            int maxLength = LongestSubstring.lengthOfLongestSubstring(s);
            System.out.println("Length of longest substring without repeating characters: " + maxLength);
        }

        public static int lengthOfLongestSubstring(String s) {
            int left = 0;
            int maxLength = 0;
            HashSet<Character> charSet = new HashSet<>();

            for (int right = 0; right < s.length(); right++) {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }

                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }
    }


