package ru.job4j.array;

/**
 * Matrix
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "1$"
 * @since 0.1
 */

public class Matrix {

    public int[][] multiple(int size) {
        int[][] rsl = new int[size][size];

        for (int i = 0; i < rsl.length; i++) {

            for (int j = 0; j < rsl.length; j++) {
                if (i == 0 && j == 0) {
                    rsl[i][j] = 1;
                    System.out.print(rsl[i][j] + "\t");
                }
                if (i == 0 && j != 0) {
                    rsl[i][j] = j + 1;
                    System.out.print(rsl[i][j] + "\t");
                }
                if (i != 0 && j == 0) {
                    rsl[i][j] = i + 1;
                    System.out.print(rsl[i][j] + "\t");
                }
                if (j != 0 && i != 0) {
                    rsl[i][j] = (i + 1) * (j + 1);
                    System.out.print(rsl[i][j] + "\t");
                }
            }

            System.out.println();
        }


        return rsl;
    }

}
