package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /******** declarando variables ***************/
        /*--- Variables primitivas ---------*/
        // se almacenan en memoria de forma independiente
        int myVariable = 30;
        byte age = 30;
        //se pone L al final mayus o minus para especificar el tipo
        long viewsCount = 3_123_456L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        /*--- Variables referencia ---------*/
        Date now = new Date();
        //point1 y point2 hacen referencia al mismo objeto en memoria, no son independientes entre si, cambios afectan
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;

        // método get time, se puede acceder por un punto a miembros del objeto
        // now.getTime()

        /******** Strings ***************/
        String message = "Hello world \"Melissa\" \nC:\t\\Windows\\...";
        //métodos: endsWith(), startsWith() retorna un booleano

        /******** Arrays ***************/
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        //manera corta
        int[] numbers2 = { 10, 20, 30 };

        /******** Constantes ***************/
        final float INTEREST_RATE = 0.04F;

        /******** Math class ***************/
        //Math.min() Math.random() Mathround
        int result = Math.max(1,2);

        /******** Input ***************/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();


        // imprimir atajo sout
        System.out.println("you are " + name);
        System.out.println(result);
        System.out.println(Arrays.toString(numbers2));
        System.out.println(message);
        System.out.println(point2);
        System.out.println(now);
	    System.out.println("Hello world " + myVariable);

    }
}
