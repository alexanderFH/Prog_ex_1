import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public boolean checkPassword(String password) {
        return password != null && checkLength(password) && checkBigSmall(password) && checkNumbers(password) &&
                checkSpecialChars(password) && !checkRunningNumbers(password) && !checkRepeatedNumbers(password);
    }

    public boolean checkLength(String password) {
        return password.length() > 7 && password.length() < 26;
    }

    public boolean checkBigSmall(String password) {
        return password.matches(".*[A-Z]+.*") && password.matches(".*[a-z]+.*");
    }

    public boolean checkNumbers(String password) {
        return password.matches(".*[0-9].*[0-9].*");
    }

    public boolean checkSpecialChars(String password) {
        return password.matches("([a-zA-Z0-9]*[()#$?!%/@]+[a-zA-Z0-9]*)+");
    }

    public boolean checkRunningNumbers(String password) {
        return checkNumberRelationsInString(password, 11, 0, 1, 2);
    }

    private boolean checkNumberRelationsInString(String password, int digit, int count, int difference, int threshold) {
        int startDigit = digit;
        int startCount = count;
        for (Character c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                if (Character.getNumericValue(c) - digit == difference)
                    count++;
                else
                    count = startCount;
                digit = Character.getNumericValue(c);
            } else {
                count = startCount;
                digit = startDigit;
            }
            if (count == threshold)
                return true;
        }
        return false;
    }

    public boolean checkRepeatedNumbers(String password) {
        return checkNumberRelationsInString(password, 11, 0, 0, 3);
    }
}
