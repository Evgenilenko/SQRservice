package ru.netology.sqr;


public class SQRservice {

    public int calc(int min, int max) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int ii = i * i;
            if (ii >= min) {
                if (ii <= max) {
                    counter++;
                }
            }
        }


        return counter;

    }


}
