import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^\\(84\\)-\\(0\\d{9}\\)$";

    public PhoneNumber() {
    }

    public boolean isValid(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
