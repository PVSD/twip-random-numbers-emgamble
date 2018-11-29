package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {


        boolean value [] = new boolean[100];
        Random rand = new Random();
        boolean yes;
        int count = 0;


        for(int i = 0; i <= 100; i++){


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

        }
        int average = count/100;
        System.out.println(average);
        System.out.println(count);








    }
}
