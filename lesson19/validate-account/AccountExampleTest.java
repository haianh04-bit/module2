public class AccountExampleTest {
    public static final String[] validAccounts = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefghij"};
    public static final String[] invalidAccounts = new String[]{"12345", ".@", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account : validAccounts) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account " + account + " is valid: " + isValid);
        }
        for (String account : invalidAccounts) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account " + account + " is valid: " + isValid);
        }
    }
}
