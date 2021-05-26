public class Password {

    public boolean checkPassword(String password) {
        return false;
    }

    public boolean checkLength(String password) {
        return password.length() > 7 && password.length() < 26;
    }

    public boolean checkBigSmall(String password) {
        return false;
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
