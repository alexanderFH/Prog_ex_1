import org.junit.jupiter.api.Test; // Wichtig für den Display Name
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {
    Password p1 = new Password();

    @Test
    @DisplayName("nullcheck")
    public void password_nullCheck() {
        assertFalse(p1.checkPassword(null));
    }

    @Test
    @DisplayName("Password length - too short")
    public void password_length_too_short() {
        assertFalse(p1.checkLength("short"));
    }

    @Test
    @DisplayName("Password length - perfect")
    public void password_length_perfect() {
        assertTrue(p1.checkLength("nottooshort"));
    }

    @Test
    @DisplayName("Password length - too long")
    public void password_length_too_long() {
        assertFalse(p1.checkLength("nottooshortbutsadlyitswaytoolong"));
    }

    @Test
    @DisplayName("Password BigSmall - false")
    public void password_not_BigSmall() {
        assertFalse(p1.checkBigSmall("alllowercase"));
    }

    @Test
    @DisplayName("Password BigSmall - TrUe")
    public void password_BigSmall() {
        assertTrue(p1.checkBigSmall("NotAllLowerCase"));
    }

    @Test
    @DisplayName("Password numbers - nonumbers")
    public void password_no_numbers() {
        assertFalse(p1.checkNumbers("nonumbers"));
    }

    @Test
    @DisplayName("Password numbers - numbers")
    public void password_numbers() {
        assertTrue(p1.checkNumbers("numb3r5"));
    }

    @Test
    @DisplayName("Password specialchar - nospecialchars")
    public void password_no_specialchars() {
        assertFalse(p1.checkSpecialChars("nospecialchars"));
    }

    @Test
    @DisplayName("Password specialchar - $pec!alChars")
    public void password_specialchars() {
        assertTrue(p1.checkSpecialChars("$pec!alChars"));
    }

    @Test
    @DisplayName("Password running numbers - pass123")
    public void password_running_numbers() {
        assertTrue(p1.checkRunningNumbers("pass123"));
    }

    @Test
    @DisplayName("Password running numbers - pass124")
    public void password_no_running_numbers() {
        assertFalse(p1.checkRunningNumbers("pass124"));
    }

    @Test
    @DisplayName("Password running numbers - pass12a3")
    public void password_no_running_numbers_2() {
        assertFalse(p1.checkRunningNumbers("pass12a3"));
    }

    @Test
    @DisplayName("Password running numbers - pass321")
    public void password_running_numbers_2() {
        assertTrue(p1.checkRunningNumbers("pass321"));
    }

    @Test
    @DisplayName("Password repeated number - pass11111")
    public void password_repeated_numbers() {
        assertTrue(p1.checkRepeatedNumbers("pass11111"));
    }

    @Test
    @DisplayName("Password repeated number - pass111")
    public void password_no_repeated_numbers() {
        assertFalse(p1.checkRepeatedNumbers("pass111"));
    }

    @Test
    @DisplayName("Password valid check")
    public void password_valid() {
        assertTrue(p1.checkPassword("v4lidPa$$w0rd"));
    }

    @Test
    @DisplayName("Password invalid check")
    public void password_invalid() {
        assertFalse(p1.checkPassword("validPa$$w0rdOhWaitItsInvalidCauseItsWayTooLong"));
    }
}
