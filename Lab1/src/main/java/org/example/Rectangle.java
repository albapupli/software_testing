package org.example;

public class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getArea() {
        return a*b;
    }
    public int getParam(){
        return 2*(a+b);
    }
}

