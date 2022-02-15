package com.company;

public class Main {

    public static void main(String[] args) {
        Shape roundabout = new Shape("red", true);
        Circle circle1 = new Circle("green",true, 4.1f);
        Rectangle rectangle1 = new Rectangle("purple", false, 2.0, 3.0);
        Square square1= new Square("pink", true,3.0, 3.0);

        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.toString());
        System.out.println(square1.getPerimeter());
        square1.text();
    }
}
