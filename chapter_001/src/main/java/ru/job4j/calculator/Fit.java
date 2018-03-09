package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Fit {
    private final double factor = 1.15; // коэфициент-множитель веса
    private final int manSub = 100;
    private final int womanSub = 110;

    /**
     * Идеальный вес для мужщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return ((height - manSub) * factor);
    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return ((height - womanSub) * factor);
    }

}

