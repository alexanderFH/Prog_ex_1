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
        return password.matches(".*[0-9]+.*");
    }

    public boolean checkSpecialChars(String password) {
        return password.matches(".*[()#$?!%/@]+.*");
    }

    public boolean checkRunningNumbers(String password) {
        int digit = 11;
        int count = 0;
        for (Character c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                if (Math.abs(Character.getNumericValue(c) - digit) == 1)
                    count++;
                else
                    count = 0;
                digit = Character.getNumericValue(c);
            }else {
                count = 0;
                digit = 11;
            }
            if (count == 2)
                return true;
        }
        return false;
    }

    public boolean checkRepeatedNumbers(String password) {
        return false;
    }
}
