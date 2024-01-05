package com.amigoscode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main{
    public static void main(String[] args){
        System.out.println("hello world");

        /* This executes i*/
        for (int i = 1; i <= 5; i++){
            System.out.println("i is " + i);
            System.out.println( "HELLO" + i + i);
        }

        //This executes j
        for (int j = 10; j >= 1; j--){
            System.out.println(j * j);

        }

        //String variable
        String name = "Mom";
        System.out.println(name);

        //integer variable
        int time = 10;
        time = 50;
        System.out.println(time + "hrs");

        //decimals or floats
        float rounding = 56.7f;
        System.out.println(rounding);

        //boolean
        boolean question;
        question = true;
        System.out.println(question);

        //byte
        byte num = 45;
        System.out.println(num);

        //char
        char label = 'l';
        System.out.println(label);
        char labeler = 'l', labels ='k', labelled = 'p';
        System.out.println("" + labeler + labels + labelled);

        //widening casting
        //from int to a float (9 to 9.0)
        int number = 9;
        float numberFloat = number;
        System.out.println(number);
        System.out.println(numberFloat);

        //Narrow Casting
        //from a float to an int (9.0 to 9)
        float door = 7.89f;
        double doors = Math.ceil(door);
        int doorNumber = (int) doors;
        System.out.println(doors);
        System.out.println(doorNumber);

        //String methods
        String naming = "He is a boy";
        System.out.println(naming.toUpperCase());
        System.out.println(naming.length());
        System.out.println(naming.indexOf("boy"));

        String firstName = "John";
        String secondName = "Kuti";
        System.out.println(firstName + " " + secondName);
        System.out.println(firstName.concat( " " +secondName));

        int maths = 40;
        int numerals = 50;
        System.out.println(Math.max(maths, numerals));
        System.out.println(Math.sqrt(maths));
        System.out.println(Math.abs(maths));
        System.out.println(Math.random() / maths);

        //if else statement
        int age = 26;
        int votingAge = 18;

        if (age > votingAge){
            System.out.println("old enough to vote");
        }else if(age == votingAge){
            System.out.println("just old enough to vote");
        }
        else{
            System.out.println("not old enough to vote");
        }

        //ternary
        System.out.println((age > votingAge) ? "vote" : "don\'t vote");








    }
}

