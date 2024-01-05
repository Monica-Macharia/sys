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

    }
}

