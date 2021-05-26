import org.junit.jupiter.api.Test; // Wichtig für den Display Name
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {
    Password p1 = new Password();

    @Test
    @DisplayName("nullcheck")
    public void password_0() {
        assertFalse(p1.checkPassword(null));
    }

    @Test
    @DisplayName("Password length - too short")
    public void password_1_a() {
        assertFalse(p1.checkLength("short"));
    }

    @Test
    @DisplayName("Password length - not too short")
    public void password_1_b() {
        assertTrue(p1.checkLength("nottooshort"));
    }

    @Test
    @DisplayName("Password BigSmall - false")
    public void password_2_a() {
        assertFalse(p1.checkBigSmall("alllowercase"));
    }

    @Test
    @DisplayName("Password BigSmall - TrUe")
    public void password_2_b() {
        assertTrue(p1.checkBigSmall("NotAllLowerCase"));
    }

    @Test
    @DisplayName("Password numbers - nonumbers")
    public void password_3_a() {
        assertFalse(p1.checkNumbers("nonumbers"));
    }

    @Test
    @DisplayName("Password numbers - numbers")
    public void password_3_b() {
        assertTrue(p1.checkNumbers("numb3r5"));
    }

    @Test
    @DisplayName("Password specialchar - nospecialchars")
    public void password_4_a() {
        assertFalse(p1.checkSpecialChars("nospecialchars"));
    }

    @Test
    @DisplayName("Password specialchar - $pec!alChars")
    public void password_4_b() {
        assertTrue(p1.checkSpecialChars("$pec!alChars"));
    }

    @Test
    @DisplayName("Password running numbers - pass123")
    public void password_5_a() {
        assertTrue(p1.checkRunningNumbers("pass123"));
    }

    @Test
    @DisplayName("Password running numbers - pass124")
    public void password_5_b() {
        assertFalse(p1.checkRunningNumbers("pass124"));
    }

    @Test
    @DisplayName("Password running numbers - pass12a3")
    public void password_5_b() {
        assertFalse(p1.checkRunningNumbers("pass12a3"));
    }

    @Test
    @DisplayName("Password repeated number - pass11111")
    public void password_6_a() {
        assertTrue(p1.checkRepeatedNumbers("pass11111"));
    }

    @Test
    @DisplayName("Password repeated number - pass111")
    public void password_6_b() {
        assertFalse(p1.checkRepeatedNumbers("pass111"));
    }
}
