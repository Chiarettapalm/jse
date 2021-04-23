package m01.s05;

public class Primitive {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println(flag);

        char c = 's';
        System.out.println(c);
/*
 * 
 *     [0][0][0][0][0][0][0][0]
 *     
 * (base10)2371=(1*10^0)+(7*10^1)+(3*10^2)+(2*10^3)noi
 * (base2)computer(si comincia da sinistra)1011=(1*2^0)+(1*2^1)+(0*2^2)+(1*2^3)=13 ora è in base 10
 * 
 */

        byte y = 42;
        System.out.println(y);

        short x = 12_000;
        System.out.println(x);

        int i = 1_000_000_000;
        System.out.println(i);

        long z = 100_000_000_000_000_000L;
        System.out.println(z);

        float f = 3.12e20F;
        System.out.println(f);

        double d = 3.12e200;
        System.out.println(d);

        double nan = Double.NaN;
        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;

        if (!Double.isNaN(nan) || !Double.isInfinite(posInf) || Double.isFinite(negInf)) {
            System.out.println("Unexpected");
        }
    }
}
