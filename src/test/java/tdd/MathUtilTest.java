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
    void mdcAImpP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }
}