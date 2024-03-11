package com.amigoscode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main{
    public static void main(String[] args){



        //References
                Date today = new Date();
                long timer = today.getTime();
                System.out.println(timer);;
         //Arrays
         int[] goats = {4,7,8,5,4,3,2,5,7,8,5};
                System.out.println(Arrays.toString(goats));

          int[] lambs = new int[3];
          lambs[0] = 4;
          lambs[1] = 3;
          lambs[2] = 7;
        System.out.println(Arrays.toString(lambs));

        String[] names = {"bobo", "honi", "hutu", "tudi"};
        System.out.println(Arrays.toString(names));

        float[] decimals = { 7.8f, 5.8f, 9.00f};
        System.out.println(Arrays.toString(decimals));

        //Multideminsional arrays
        //eg. [[2,3,4],[45,5,6]];
        int[][] students = new int[2][3];
        students[0][0] = 4;
        students[0][1] = 5;
        students[0][2] = 6;
        students[1][0] = 7;
        students[1][1] = 8;
        students[1][2] = 9;
        System.out.println(Arrays.deepToString(students));

        int[][] unis = {{4,5,6}, {5,7,7}};
        System.out.println(Arrays.deepToString(unis));

        //Constants in Java are called final :()
        //The variable names are capitalized
        //final datatype VARIABLENAME = value;
        final float PI = 3.14f;

        //casting
        //implicit or automatic casting
        //from a small number to a bigger number
        int rental = 1;
        double rentals = rental;
        System.out.println(rental);
        System.out.println(rentals);

        //explicit or manual
        //from a big number to a small number
        //change the type the initial data type to a compatible data type
        double client = 4.900090909090909090909D;
        float clients = (float) client;
        System.out.println(client);
        System.out.println(clients);

        //changing a String into an it or float
        String customer ="6";
        Integer.parseInt(customer);
        System.out.println(customer);

        String roads = "6.56";
        Float.parseFloat(roads);
        System.out.println(roads);

        //Math class
        int tours = (int) (Math.random() * 100);
        System.out.println(tours);

        //formatting numbers using NumberFormat
      String sale = NumberFormat.getCurrencyInstance().format(-98.00);
        System.out.println(sale);

        //Scanner: Reading the Console
//        Scanner inputs = new Scanner(System.in);
//        String date = inputs.nextLine();
////        System.out.println( "Today is: " + date);


        //calculatig Mortage Exercise

        int principalAmount = 200000;
        float monthlyInterestRate = 70.0f / 12;
        int monthlyRate = (int) monthlyInterestRate;
        System.out.println(monthlyRate);
        int months = 60;

            //monthly interest
           int interest = (monthlyRate * ((int) Math.pow(monthlyRate, 2)));
        System.out.println(interest);
           int interestTotal = (int) Math.pow(interest, 30);
        System.out.println(interestTotal);

           //denominator
            int division = (int) Math.pow((1 + monthlyRate),30);
        System.out.println(division);

            //division
            int total = (interestTotal / division) * principalAmount;
        System.out.println("hello");
            System.out.println(total);
        System.out.println("hello");













    }}


