package com.company;

public class Square extends Rectangle{

    Square(String color, boolean filled, double width, double length) {
        super(color, filled, length, width);
        length=width;
    }
    public void text(){
        System.out.println("text");
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
