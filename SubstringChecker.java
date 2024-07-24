package SOTI_probs;

//Check if a string is a substring of another

import java.util.Scanner;

public class SubstringChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            int index = isSubstring(s1, s2);
            if (index == -1) {
                System.out.println("Not Present");
            } else {
                System.out.println("Present at index: " + index);
            }
        }
        public static int isSubstring(String s1, String s2) {
            return s2.indexOf(s1);
        }
    }

