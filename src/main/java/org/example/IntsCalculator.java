package org.example;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
        return 0;
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        return 0;
    }

    @Override
    public int pow(int a, int b) {
        //считаем через target
        return 0;
    }
}


