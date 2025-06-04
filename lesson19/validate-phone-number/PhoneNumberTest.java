public class PhoneNumberTest {
    public static final String[] validPhoneNumbers = new String[]{"(84)-(0978489648)", "(84)-(0978489648)", };
    public static final String[] invalidPhoneNumbers = new String[]{"(a8)-(22222222)", "(84)-(9978489648)"};
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String phone : validPhoneNumbers) {
            boolean isValid = phoneNumber.isValid(phone);
            System.out.println("Phone number " + phone + " is valid: " + isValid);
        }

        for (String phone : invalidPhoneNumbers) {
            boolean isValid = phoneNumber.isValid(phone);
            System.out.println("Phone number " + phone + " is valid: " + isValid);
        }
    }
}
