package com.cambeeler;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //  Developing and exploring JAVA composition - this is for github change testing
        Dimensions dimensions = new Dimensions(5, 10, 24);
        Case CamsCase = new Case("220_18","AMD" , "PRE220V", dimensions);

        Monitor monitor = new Monitor("2100", "Acer", 27, new Resolution(2540, 1440)  );

        Motherboard motherboard = new Motherboard("A1-A1", "Dell", 3, 7, "8.1" );

        PC pc = new PC(CamsCase, monitor, motherboard);

        pc.powerUp();

    }
}
