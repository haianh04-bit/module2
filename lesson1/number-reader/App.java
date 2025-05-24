import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc: ");
        int input = scanner.nextInt();
        String output = "";
        if (input < 10) {
            output = switch (input) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> "zero";
            };
        } else {
            if (input < 20) {
                output = switch (input) {
                    case 10 -> "Ten";
                    case 11 -> "Eleven";
                    case 12 -> "Twelve";
                    case 13 -> "Thirteen";
                    case 14 -> "Fourteen";
                    case 15 -> "Fifteen";
                    case 16 -> "Sixteen";
                    case 17 -> "Seventeen";
                    case 18 -> "Eighteen";
                    default -> "Nineteen";
                };
            } else {
                int tensDigit = input / 10;
                String tensDigitRead = switch (tensDigit) {
                    case 2 -> "twenty";
                    case 3 -> "thirty";
                    case 4 -> "Twelve";
                    case 5 -> "forty";
                    case 6 -> "sixty";
                    case 7 -> "seventy";
                    case 8 -> "eighty";
                    default -> "ninety";
                };

                int unitDigit = input % 10;
                String unitDigitRead = switch (unitDigit) {
                    case 1 -> "one";
                    case 2 -> "two";
                    case 3 -> "three";
                    case 4 -> "four";
                    case 5 -> "five";
                    case 6 -> "six";
                    case 7 -> "seven";
                    case 8 -> "eight";
                    case 9 -> "nine";
                    default -> "zero";
                };
                output = tensDigitRead + " " + unitDigitRead;

            }
        }

        System.out.println(input + " doc la: " + output);
    }
}