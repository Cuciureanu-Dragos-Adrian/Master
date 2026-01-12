import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClaseDeEchivalenta {
    @Test
    public void testC1() {
        // C1: n = 113, output = "Da"
        int n = 113;
        Assertions.assertEquals("Da", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void testC2() {
        // C2: n = 109, output = "Nu"
        int n = 109;
        Assertions.assertEquals("Nu", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void testC3() {
        // C3: n = 79, output = "Numar invalid"
        int n = 79;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void testC4() {
        // C4: n = 120, output = "Numar invalid"
        int n = 120;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void testC5() {
        // C5: n = 12, output = "Numar invalid"
        int n = 12;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }
}