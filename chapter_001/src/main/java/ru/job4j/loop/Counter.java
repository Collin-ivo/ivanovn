package ru.job4j.loop;

public class Counter {
    private int temp = 0;

    public int add(int start, int finish) {
        for (int t = start; t <= finish; t++) {
            if (t % 2 == 0) {
                temp = temp + t;
            }
        }
        return temp;
    }
}
