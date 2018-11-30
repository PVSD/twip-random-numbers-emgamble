package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        boolean value [] = new boolean[100];
        Random rand = new Random();
        boolean yes = false;
        int count = 0;
        Scanner number = new Scanner(System.in);
        System.out.println("How many times do you want to run it?");
        int size = number.nextInt();
        int total = 0;


        for(int i = 0; i <= size; i++){


            while(yes == false){
                int rdm = rand.nextInt(100);
                value[rdm]= true;
                count++;

                for (boolean x: value) {
                    if(x==false) {
                        yes = false;
                    }
                    else
                        yes = true;


                }
            }
            total = total + count;

        }
        int average = total/size;
        System.out.println("Average number of runs:" + average);
        //System.out.println(count);








    }
}
