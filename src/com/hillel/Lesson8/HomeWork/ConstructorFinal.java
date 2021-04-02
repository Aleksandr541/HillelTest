package com.hillel.Lesson8.HomeWork;

public class ConstructorFinal {
    private final int A;
    private final int B;
    private final int C;

    public ConstructorFinal() {
        this.A = 0;
        this.B = 0;
        this.C = 0;
    }

    public ConstructorFinal(int _A, int _B, int _C) {
        A = _A;
        B = _B;
        C = _C;
    }

    //               set не получается
    public final int getA() {
        return A;
    }

    //       public final void setA(int A){
//           A= A;
//       }
    public int getB(int B) {
        return B;
    }

    //       public void setB(int B){
//            B=B;
//       }
    public int getC(int C) {
        return C;
    }
//       public void setC(int C){
//            C=C;
//       }

    @Override
    public String toString() {
        return "ConstructorFinal{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}
