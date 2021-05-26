package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("all")
class MathUtilTest {

    @Test
    void mdcAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP1AImp() {
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP2Pares() {
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int obtido = MathUtil.mdc(a, b);
        assertTrue(obtido % divisor == 0);
    }

    @Test
    void mdcP3APositivo() {
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(obtido, esperado);
    }

    @Test
    void mdcP3ANegativo() {
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(obtido, esperado);
    }

    @Test
    void mdcMP4Par() {
        final int a = 16;
        final int b = 8;
        final int m = 10;
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP5() {
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = MathUtil.mdc(a*b, c);
        final int obtido = MathUtil.mdc(b, c);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP5Resultado1() {
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(b, c);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP6() {
        final int a = 8;
        final int b = 2;
        final int esperado = MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP7TudoNegativo() {
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcGeralIndivisiveis() {
        final int a = 30;
        final int b = 12;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcMultiplosValores() {
        final int a = 30;
        final int b = 12;
        final int c = 4;
        final int esperado = 2;
        final int obtido = MathUtil.mdc(a, b, c);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcNenhumParametro() {
        assertThrows(IllegalArgumentException.class,
                    () -> MathUtil.mdc());
    }

    @Test
    void mdcNulo() {
        assertThrows(NullPointerException.class,
                    () -> MathUtil.mdc(null));
    }
}