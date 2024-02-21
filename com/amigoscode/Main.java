package com.amigoscode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Date;

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









    }}


