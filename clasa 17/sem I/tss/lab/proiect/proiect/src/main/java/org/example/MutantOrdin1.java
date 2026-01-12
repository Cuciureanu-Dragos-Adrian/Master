package org.example;

public class MutantOrdin1 {
    public static void main(String[] args) {
        System.out.println(verificareCifreCrescatoare(109));
        System.out.println(verificareCifreCrescatoare(113));
        System.out.println(verificareCifreCrescatoare(89));
    }

    public static String verificareCifreCrescatoare(int n) {
        boolean ok = true;
        if (n < 100 || !verificarePrim(n)) {
            return "Numar invalid";
        }
        int cifraAnterioara = n % 10;
        n /= 10;
        while (n != 0 && ok) {
            int cifraCurenta = n % 10;
            if (cifraCurenta > cifraAnterioara)
                ok = false;
            cifraAnterioara = cifraCurenta;
            n /= 10;
        }
        if (ok)
            return "Da";
        else
            return "Nu";
    }

    static boolean verificarePrim(int n) {
        if (n < 2)
            return false;
        // am modificat din n - 1 in radical de n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
