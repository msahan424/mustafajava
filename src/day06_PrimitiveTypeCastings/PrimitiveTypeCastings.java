package day06_PrimitiveTypeCastings;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {
        byte a= 100;
        short b = (short)a;
        // (short)a
        //System.out.println("b = " + b);
        int c = b; // implicit casting
        //int c = (int)b
        long d = c;
        // long d =(long)c
        float e =d;
        // float e = (float)d;
        double f= e;
        //double f = (double)e;
        System.out.println("f = " + f);
        /* double> float>long>int>short>byte
        Smaller primitives can be directly assigned to larger primitives type but
        Larger primitives can NOT directly assigned to smaller primitives type

         */
        int x = 55;

        short y = (short) x; //explicit casting
        System.out.println("y = " + y);
        long j = 100000;
        short k = (short) j;
        System.out.println("j+ = " + k);


        

    }
}
