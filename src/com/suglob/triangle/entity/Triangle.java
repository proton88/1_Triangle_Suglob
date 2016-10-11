package com.suglob.triangle.entity;


public class Triangle {
    private Dot a;
    private Dot b;
    private Dot c;

    public Triangle(){}

    public Triangle(Dot a, Dot b, Dot c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Dot getA() {
        return a;
    }

    public void setA(Dot a) {
        this.a = a;
    }

    public Dot getB() {
        return b;
    }

    public void setB(Dot b) {
        this.b = b;
    }

    public Dot getC() {
        return c;
    }

    public void setC(Dot c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}'+"\n";
    }
}
