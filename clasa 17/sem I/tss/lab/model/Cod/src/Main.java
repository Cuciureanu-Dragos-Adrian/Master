public class Main
{
    public static void main(String[] args) {
        System.out.println(verificaAlternantaPareImpare(23));
    }

    public static String verificaAlternantaPareImpare(int n)
    {
        boolean respectaConditia = true;

        if (n < 10 || !estePrim(n)) {
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

