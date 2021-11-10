package com.company;
import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float x ;
        float y ;
        float a = 0;

        System.out.println("Zadaj km v prvy den ");
        Scanner xa = new Scanner(System.in);
        x = xa.nextFloat();

        System.out.println("Zadaj cielove km ");
        Scanner ya = new Scanner(System.in);
        y = ya.nextInt();

        while (x<y){
            float o;
            x = x * 1.1f;

            a++;
            if (x>=y) {
                System.out.println("den " + a );
                System.out.println("km " + x);
            }
        }
    }}