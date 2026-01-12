import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteCauseEffectGraphing {

    @Test
    public void testCE1() {
        // CE1: n = 29, output = "DA"
        // 29 este prim, >= 10, și cifrele alternează par/impar
        int n = 29;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("DA", rezultat);
    }

    @Test
    public void testCE2() {
        // CE2: n = 19, output = "NU"
        // 19 este prim, >= 10, dar cifrele nu alternează par/impar
        int n = 19;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("NU", rezultat);
    }

    @Test
    public void testCE3() {
        // CE3: n = 8, output = "invalid"
        // 8 este mai mic decât 10, dar nu este prim
        int n = 8;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("invalid", rezultat);
    }

    @Test
    public void testCE4() {
        // CE4: n = 3, output = "invalid"
        // 3 este prim, dar este mai mic decat 10
        int n = 3;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("invalid", rezultat);
    }

    @Test
    public void testCE5() {
        // CE5: n = 10, output = "NU"
        // 10 este >= 10, dar nu este prim
        int n = 10;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("invalid", rezultat);
    }
}