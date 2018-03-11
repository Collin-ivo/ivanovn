package ru.job4j.loop;

public class Factorial {
    private int temp = 1;

    public int calc(int n) {

        for (int f = 1; f <= n; f++) {
            temp = temp * f;

        }
        return temp;
    }
}
