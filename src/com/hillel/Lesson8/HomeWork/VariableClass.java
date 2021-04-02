package com.hillel.Lesson8.HomeWork;

class VariableClass {

    private byte variable1;
    private short variable2;
    private int variable3;
    private long variable4;
    private char variable5;
    private float variable6;
    private double variable7;
    private boolean variable8;
    private String variable9;


    public VariableClass() {
    }

    public VariableClass(byte variable1) {
        this.variable1 = variable1;
    }

    public VariableClass(byte variable1, short variable2) {
        this(variable1);
        this.variable2 = variable2;
    }

    public VariableClass(byte variable1, short variable2, int variable3) {
        this(variable1, variable2);
        this.variable3 = variable3;
    }

    public VariableClass(byte variable1, short variable2, int variable3, long variable4) {
        this(variable1, variable2, variable3);
        this.variable4 = variable4;
    }

    public VariableClass(byte variable1, short variable2, int variable3, long variable4, char variable5) {
        this(variable1, variable2, variable3, variable4);
        this.variable5 = variable5;
    }

    public VariableClass(byte variable1, short variable2, int variable3, long variable4, char variable5, float variable6) {
        this(variable1, variable2, variable3, variable4, variable5);
        this.variable6 = variable6;
    }

    public VariableClass(byte variable1, short variable2, int variable3, long variable4, char variable5, float variable6, double variable7) {
        this(variable1, variable2, variable3, variable4, variable5, variable6);
        this.variable7 = variable7;
    }

    public VariableClass(byte variable1, short variable2, int variable3, long variable4, char variable5, float variable6, double variable7, boolean variable8) {
        this(variable1, variable2, variable3, variable4, variable5, variable6, variable7);
        this.variable8 = variable8;
    }

    public VariableClass(byte variable1, short variable2, int variable3, long variable4, char variable5, float variable6, double variable7, boolean variable8, String variable9) {
        this(variable1, variable2, variable3, variable4, variable5, variable6, variable7, variable8);
        this.variable9 = variable9;

    }

    public byte getVariable1() {
        return variable1;
    }

    public void setVariable1(byte variable1) {
        this.variable1 = variable1;
    }

    public short getVariable2() {
        return variable2;
    }

    public void setVariable2(short variable2) {
        this.variable2 = variable2;
    }

    public int getVariable3() {
        return variable3;
    }

    public void setVariable3(int variable3) {
        this.variable3 = variable3;
    }

    public long getVariable4() {
        return variable4;
    }

    public void setVariable4(long variable4) {
        this.variable4 = variable4;
    }

    public char getVariable5() {
        return variable5;
    }

    public void setVariable5(char variable5) {
        this.variable5 = variable5;
    }

    public float getVariable6() {
        return variable6;
    }

    public void setVariable6(float variable6) {
        this.variable6 = variable6;
    }

    public double getVariable7() {
        return variable7;
    }

    public void setVariable7(double variable7) {
        this.variable7 = variable7;
    }

    public boolean getVariable8() {
        return variable8;
    }

    public void setVariable8(boolean variable8) {
        this.variable8 = variable8;
    }

    public String getVariable9() {
        return variable9;
    }

    public void setVariable9(String variable9) {
        this.variable9 = variable9;
    }

    @Override
    public String toString() {
        return "VariableClass{" +
                "variable1=" + variable1 +
                ", variable2=" + variable2 +
                ", variable3=" + variable3 +
                ", variable4=" + variable4 +
                ", variable5=" + variable5 +
                ", variable6=" + variable6 +
                ", variable7=" + variable7 +
                ", variable8=" + variable8 +
                ", variable9='" + variable9 + '\'' +
                '}';
    }
}