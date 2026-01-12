import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestValoriDeFrontiera {
    @Test
    public void testB1() {
        // B1: n = 99, output = "Numar invalid"
        int n = 99;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void testB2() {
        // C2: n = 100, output = "Numar invalid"
        int n = 100;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void testB3() {
        // C3: n = 97, output = "Numar invalid"
        int n = 97;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void testB4() {
        // C4: n = 113, output = "Da"
        int n = 113;
        Assertions.assertEquals("Da", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void testB5() {
        // C5: n = 101, output = "Nu"
        int n = 101;
        Assertions.assertEquals("Nu", Main.verificareCifreCrescatoare(n));
    }
}
