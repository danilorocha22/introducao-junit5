package tdd;

public class MathUtil {

    private MathUtil(){}

    public static int mdc(int a, int b){
        return -1;
    }

    public static boolean isPrimo(final long numero){
        if(numero <= 1){
            return false;
        }

        for(long i = 2; i < numero; i++){
            if(numero%i==0){
                return false;
            }
        }

        return true;
    }

}
