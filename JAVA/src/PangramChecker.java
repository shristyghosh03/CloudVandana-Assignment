import java.util.Scanner;

public class PangramChecker {
        public static boolean checkPangram(String str) {
            str = str.toLowerCase();
            boolean[] alphaexist = new boolean[26]; //  A to Z

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if ('a' <= c && c <= 'z') {
                    alphaexist[c - 'a'] = true;
                }
            }

            // Check if all letters from A to Z are present
            for (boolean letterPresent : alphaexist) {
                if (!letterPresent) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String Value:");
            String in = sc.nextLine(); //take input from user
            boolean checkPangram = checkPangram(in);

            if (checkPangram) {
                System.out.println("The input is a pangram.");
            } else {
                System.out.println("The input is not a pangram.");
            }
        }
    }


