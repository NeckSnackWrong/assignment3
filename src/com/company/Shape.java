package com.company;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    Shape(String color, boolean filled) {
        this.color=color;
        this.filled=filled;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (filled==true){
            return "A Shape with color of " + color + " and filled";
        }
        else {
            return "A Shape with color of " + color + " and Not filled";
        }
    }
}
