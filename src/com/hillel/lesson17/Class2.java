package lesson17;

public class Class2 {
    private int b;

    public Class2(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "b=" + b +
                '}';
    }
}
