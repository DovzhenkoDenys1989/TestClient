package com.company;

import com.google.gson.Gson;
import edu.brainacademy.Client;

import java.text.DecimalFormat;


public class Main {

    public static void main(String[] args) {
//        Client client = new Client ("test", "test", "test");
//        System.out.println(client);
//        Gson gson = new Gson();

        


        Rectangle rectangle = new Rectangle("red",4,3);
//        System.out.println(rectangle.area());

        Square square =  new Square("green",3);

        Circle circle = new Circle("yellow",5);

//        System.out.println(square.area());

//        System.out.println(square.getColor());

        Shape[] shapes = {rectangle, square, circle};
        for (Shape shape : shapes) {
            shape.showColorAndArea();
        }
    }
}

