package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(90) + 10;
        int number1 = random.nextInt(90) + 10;
        int result = number + number1;
        System.out.println(result);
    }
}
