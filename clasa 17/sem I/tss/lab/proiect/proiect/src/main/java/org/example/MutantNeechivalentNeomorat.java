package org.example;

public class MutantNeechivalentNeomorat {
    public static void main(String[] args) {
        System.out.println(verificareCifreCrescatoare(109));
        System.out.println(verificareCifreCrescatoare(113));
        System.out.println(verificareCifreCrescatoare(79));
    }

    public static String verificareCifreCrescatoare(int n) {
        boolean ok = true;
        // am modificat valoarea pe care trebuie sa o depaseasca n din 100 in 80
        if (n < 80 || !verificarePrim(n)) {
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
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
