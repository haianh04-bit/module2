import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int number = sc.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Yêu cầu nhập lại: ");
        } else {
            System.out.println("Cách đọc:" + readNumber(number));
        }
    }
    public static String readNumber(int number) {
        if (number < 10) {
            return oneDigitToWord(number);
        } else if (number < 20) {
            return teensToword(number);
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            return tensToWord(tens) + (ones != 0 ? " " + oneDigitToWord(ones) : "");
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;
            String result = oneDigitToWord(hundreds) + "hundreds";
            if (remainder != 0) {
                result += "and" + readNumber(remainder);
            }
            return result;
        }
    }
    public static String oneDigitToWord(int num) {
        switch (num) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    public static String teensToword(int num) {
        switch (num) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }
    public static String tensToWord(int num) {
        switch (num) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
