package bt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentCode {
    private static final String STUDENT_CODE_REGEX = "^(HV\\d{4}$)";

    public StudentCode() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(STUDENT_CODE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
