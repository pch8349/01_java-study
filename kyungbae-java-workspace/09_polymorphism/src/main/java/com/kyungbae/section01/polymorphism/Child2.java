package com.kyungbae.section01.polymorphism;

public class Child2 extends Parent {

    private int n;

    public Child2(){}

    public Child2(int x, int y, int n) {
        super(x, y);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void printChild2(){
        System.out.println("I'm Child2");
    }

    @Override
    public void print(){
        System.out.println("I'm Child2");
    }

}
