import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCauzaEfect {
    @Test
    public void test1() {
        // 1: n = 239, output = "Da"
        int n = 239;
        Assertions.assertEquals("Da", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void test2() {
        // 2: n = 151, output = "Nu"
        int n = 151;
        Assertions.assertEquals("Nu", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void test3() {
        // 3: n = 65, output = "Numar invalid"
        int n = 65;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void test4() {
        // 4: n = 73, output = "Numar invalid"
        int n = 73;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }

    @Test
    public void test5() {
        // 5: n = 150, output = "Numar invalid"
        int n = 150;
        Assertions.assertEquals("Numar invalid", Main.verificareCifreCrescatoare(n));
    }
}
