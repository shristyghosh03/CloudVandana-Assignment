import java.util.*;
public class ConvertRomanToInteger {
        public static int romanToInt(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }

            int result = 0;
            int prevValue = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                char currentChar = s.charAt(i);
                int currentValue = romanCharToInt(currentChar);

                if (currentValue < prevValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }

                prevValue = currentValue;
            }

            return result;
        }

        public static int romanCharToInt(char c) {
            switch (c) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0; // Invalid Roman numeral character
            }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Roman Value:");
            String romanNumeral = sc.nextLine(); //take input from user
            int integerEquivalent = romanToInt(romanNumeral);
            System.out.println("The integer equivalent of " + romanNumeral + " is: " + integerEquivalent);
        }
    }
