package bt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookCode {
    private static final String BOOK_CODE_REGEX = "^(BOOK\\d{4})$";

    public BookCode() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(BOOK_CODE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
