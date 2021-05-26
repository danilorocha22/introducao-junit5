package tdd;

import java.util.Objects;

@SuppressWarnings("all")
public class MathUtil {

    public static int mdc(int a, int b) {

        //Propriedade 7
        a = Math.abs(a);
        b = Math.abs(b);

        //Propriedade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        //Propriedade 1 e 2
        if (b > 0 && a % b == 0) {
            return b;
        }

        //Propriedade 3 e 4
        if (b == 0) {
            return Math.abs(a);
        }

        return mdc(a - b, b);
    }

    public static int mdc(int ...valores) {
        Objects.requireNonNull(valores, "O valor informado" +
                "não pode ser nulo!");
        if (valores.length == 0) {
            throw new IllegalArgumentException("" +
                    "Informe ao menos um valor para " +
                    "cálcular o MDC!");
        }
        int a = valores[0];
        for (int b : valores) {
            a = mdc(a, b);
        }
        return a;
    }

}
