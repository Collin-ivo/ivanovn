package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Fit {
    private static final double FACTOR = 1.15; // коэфициент-множитель веса
    private static final int MAN_SUB = 100;
    private static final int WOMAN_SUB = 110;

    /**
     * Идеальный вес для мужщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return ((height - MAN_SUB) * FACTOR);
    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return ((height - WOMAN_SUB) * FACTOR);
    }

}

