import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_NAME_REGEX = "^[ACP]\\d{4}[GHIK]$";

    public ClassName() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
