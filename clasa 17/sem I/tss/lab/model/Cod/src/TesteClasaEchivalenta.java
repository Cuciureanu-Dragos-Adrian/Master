import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteClasaEchivalenta {
    @Test
    public void testC1() {
        // Clasa de echivalență C1: n = 23, output = "DA"
        int n = 23;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("DA", rezultat);
    }

    @Test
    public void testC2() {
        // Clasa de echivalență C2: n = 13, output = "NU"
        int n = 13;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("NU", rezultat);
    }

    @Test
    public void testC3() {
        // Clasa de echivalență C3: n = 5, output = "invalid"
        int n = 5;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("invalid", rezultat);
    }

    @Test
    public void testC4() {
        // Clasa de echivalență C4: n = 12, output = "invalid"
        int n = 12;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("invalid", rezultat);
    }

    @Test
    public void testC5() {
        // Clasa de echivalență C5: n = 6, output = "invalid"
        int n = 6;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("invalid", rezultat);
    }
}