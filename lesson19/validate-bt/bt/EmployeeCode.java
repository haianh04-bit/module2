package bt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeCode {
    private static final String EMPLOYEE_CODE_REGEX = "^(NV\\d{4}$)";

    public EmployeeCode(){

    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(EMPLOYEE_CODE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
