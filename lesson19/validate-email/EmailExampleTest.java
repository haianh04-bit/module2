public class EmailExampleTest {
    public static final String[] validEmails = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmails = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email : validEmails) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
        for (String email : invalidEmails) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}
