// mutantul NU este omorat de catre testul C3 din TesteClasaEchivalenta
// deoarece pentru input 5 returneaza tot "invalid"
public class MutantNeechivalentNeomorat {
    public static String verificaAlternantaPareImpare(int n)
    {
        boolean respectaConditia = true;

        if (n < 8 || !estePrim(n)) { //schimbam n < 10 cu n < 3
            return "invalid";
        }

        boolean paritateAnterioara = ((n % 10) % 2 == 0);
        n /= 10;

        while (n > 0) {
            boolean paritateCurenta = ((n % 10) % 2 == 0);

            if (paritateCurenta == paritateAnterioara)
            {
                respectaConditia = false;
                break;
            }

            paritateAnterioara = paritateCurenta;
            n /= 10;
        }

        if (!respectaConditia)
            return "NU";
        else
            return "DA";
    }

    private static boolean estePrim(int numar)
    {
        if (numar < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                return false;
            }
        }
        return true;
    }
}
