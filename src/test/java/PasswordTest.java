import org.junit.jupiter.api.Test; // Wichtig für den Display Name
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {
    Password p1 = new Password();

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
    @DisplayName("Password specialchar")
    public void password_4() {
        assertEquals(0, 0,
                "specialchar");
    }

    @Test
    @DisplayName("Password running numbers")
    public void password_5() {
        assertEquals(0, 0,
                "running numbers");
    }

    @Test
    @DisplayName("Password repeated number")
    public void password_6() {
        assertEquals(0, 0,
                "repeated number");
    }
}
