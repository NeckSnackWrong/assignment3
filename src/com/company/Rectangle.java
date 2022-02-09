package com.company;

public class Rectangle extends Shape{
    private double width=1.0;
    private double length=1.0;

    Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
