import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public boolean checkPassword(String password) {
        return false;
    }

    public boolean checkLength(String password) {
        return password.length() > 7 && password.length() < 26;
    }

    public boolean checkBigSmall(String password) {
        Matcher matcherBig = Pattern.compile("[A-Z]+").matcher(password);
        Matcher matcherSmall = Pattern.compile("[a-z]+").matcher(password);
        return matcherBig.results().count() > 0 && matcherSmall.results().count() > 0;
    }

    public boolean checkNumbers(String password) {
        return false;
    }

    public boolean checkSpecialChars(String password) {
        return false;
    }

    public boolean checkRunningNumbers(String password) {
        return false;
    }

    public boolean checkRepeatedNumbers(String password) {
        return false;
    }
}
