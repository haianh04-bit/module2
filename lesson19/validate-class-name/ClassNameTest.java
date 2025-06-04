public class ClassNameTest {
    public static final String[] validClassNames = new String[]{"C0325G", "A0325K"};
    public static final String[] invalidClassNames = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String validClassName : validClassNames) {
            boolean isValid = className.validate(validClassName);
            System.out.println("Class name " + validClassName + " is valid: " + isValid);
        }
        for (String invalidClassName : invalidClassNames) {
            boolean isValid = className.validate(invalidClassName);
            System.out.println("Class name " + invalidClassName + " is valid: " + isValid);
        }
    }
}
