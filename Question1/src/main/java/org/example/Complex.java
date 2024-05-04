package org.example;

import java.util.Scanner;

public class Complex {
    private double real;

    public double getImag() {
        return imag;
    }

    public double getReal() {
        return real;
    }

    private double imag;
    private Scanner sc = new Scanner(System.in);

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex(){
    }
    public void input(){
        System.out.println("Real: ");
        this.real = sc.nextDouble();
        System.out.println("Imag: ");
        this.imag = sc.nextDouble();
    }
    public void print(){
        System.out.println(real + "+" + imag+"i");
    }


    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public Complex mul(Complex num){
        Complex c = new Complex();
        double real_c = this.real * num.getReal() - this.imag * num.getImag();
        double imag_c = this.real*num.getImag() + this.imag*num.getReal();
        c.setImag(imag_c);
        c.setReal(real_c);
        return c;
    }

    public Complex add(Complex num){
        Complex c = new Complex();
        c.setReal(this.real + num.getReal());
        c.setImag(this.imag + num.getImag());
        return c;
    }
    public Complex sub(Complex num){
        Complex c = new Complex();
        c.setReal(this.real - num.getReal());
        c.setImag(this.imag - num.getImag());
        return c;
    }
    public Complex div(Complex num){
        Complex c = new Complex();
        c.setReal((this.real*num.getReal()+this.imag*num.getImag())/(num.getReal()*num.getReal() + num.getImag()*num.getImag()));
        c.setImag((this.real*num.getImag()-this.imag*num.getReal())/(num.getReal()*num.getReal() + num.getImag()*num.getImag()));
        return c;
    }

}
