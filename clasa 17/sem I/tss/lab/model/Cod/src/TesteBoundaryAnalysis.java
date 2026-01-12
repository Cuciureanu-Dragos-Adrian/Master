import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteBoundaryAnalysis {

    @Test
    public void testB1() {
        // Testul B1: n = 9, output = "invalid"
        int n = 9;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("invalid", rezultat);
    }

    @Test
    public void testB2() {
        // Testul B2: n = 10, output = "invalid"
        int n = 10;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("invalid", rezultat);
    }

    @Test
    public void testB3() {
        // Testul B3: n = 3, output = "invalid"
        int n = 3;
        String rezultat = Main.verificaAlternantaPareImpare(n);
        assertEquals("invalid", rezultat);
    }
}
