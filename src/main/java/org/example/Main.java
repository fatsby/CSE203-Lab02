package org.example;

public class Main {
    public static void main(String[] args) {
       Complex num = new Complex(1,2);
       Complex num2 = new Complex(3,4);

       num.add(num2).print();
       num.mul(num2).print();
       num.sub(num2).print();
       num.div(num2).print();

    }
}