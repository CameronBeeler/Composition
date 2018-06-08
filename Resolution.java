package com.cambeeler;

public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }


//    GETTER

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


//    SETTER


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
