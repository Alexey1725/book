package com.mix;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        info("User");
        String Java = "Welcome to the observatory";
        info(Java);
        ArrayList<Integer> bain = new ArrayList<>();
         bain.add(136);
         bain.add(1255);
         bain.add(100);
         bain.add(9163);

         for(Integer el : bain)
             System.out.println(el);
         byte[] nums1 = new byte[] {5, 7, 3};
         int summ1 = summaArray(nums1);
         System.out.println("Сумма 1 = " + summ1);

         byte[] nums2 = new byte[] {2, 5, 4, 7, 9};
         int summ2 = summaArray(nums2);
         System.out.println("Сумма 2 = " + summ2);
         WowLand Earth = new WowLand();
         Earth.weight = 1000;
         Earth.colour = "Green-blue";
         Earth.coordinate = new int[] {-625, 505, 21};

         WowLand Mars = new WowLand();
         Mars.weight = 990;
         Mars.colour = "red";
         Mars.coordinate = new int[] {8612, -98, 62};

        System.out.println("Масса Земли: " + Earth.weight + "." + "\nМасса Марса: " + Mars.weight + ".");
    }

    public static void info(String word) {
        System.out.print("Hi, ");
        System.out.print(word);
        System.out.println("!");
    }

    public static int summaArray(byte[] arr) {
        int summa = 0;
        byte a;
        for (a = 0; a < arr.length; a++)
        summa += arr[a];

        return summa;
    }

}