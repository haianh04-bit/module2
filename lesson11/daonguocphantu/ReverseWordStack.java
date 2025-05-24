public class ReverseWordStack {
    public static String reverseWords(String input) {
        MyCharStack stack = new MyCharStack();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "hello world";
        String reversed = reverseWords(original);
        System.out.println("Chuỗi gốc: " + original);
        System.out.println("Chuỗi đảo ngược: " + reversed);
    }
}