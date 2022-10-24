package ba.unsa.etf.rpr;

public class Matematika {
    public static double sinus(double unos) {
        unos = unos % (2 * Math.PI);

        // compute the Taylor series approximation
        double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
            term *= (unos / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }



        return sum;
    }

    public static long faktorijel(int unos) {
        long rez = 1;


        if (unos < 0) {
            try {
                throw new ArgumentIzutetak("Unos manji od 0");
            } catch (ArgumentIzutetak e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = unos; i > 1; i--) {
            rez *= i;
        }

        return rez;
    }
}
