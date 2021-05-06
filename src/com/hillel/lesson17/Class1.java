package lesson17;

public class Class1 {
    private int a;

    public Class1(int a) {
        this.a =a;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "a=" + a +
                '}';
    }
}
