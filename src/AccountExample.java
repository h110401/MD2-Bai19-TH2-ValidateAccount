import java.util.regex.Pattern;

public class AccountExample {
    private static final String REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {
    }

    public boolean validate(String value) {
        Pattern pattern = Pattern.compile(REGEX);
        return pattern.matcher(value).matches();
    }
}
