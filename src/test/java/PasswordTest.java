import org.junit.jupiter.api.Test; // Wichtig für den Display Name
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {
    @Test
    @DisplayName("Password length")
    public void password_1() {
        assertEquals(0, 0,
                "Length");
    }

    @Test
    @DisplayName("Password BigSmall")
    public void password_2() {
        assertEquals(0, 0,
                "BigSmall");
    }

    @Test
    @DisplayName("Password numbers")
    public void password_3() {
        assertEquals(0, 0,
                "numbers");
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
