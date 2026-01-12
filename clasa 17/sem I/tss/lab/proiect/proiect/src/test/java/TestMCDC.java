import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMCDC {
    @Test
    public void testMCDC1() {
        // 1: n = 200, output = "Numar invalid"
        int n = 200;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void testMCDC2() {
        // 2: n = 179, output = "Da"
        int n = 179;
        Assertions.assertEquals("Da", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void testMCDC3() {
        // 3: n = 65, output = "Numar invalid"
        int n = 31;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }
}