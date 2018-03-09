package ru.job4j.calculator;

/**
 * Конвертер валюты
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Converter {
    // задаем курсы валют
    private static final int RUB_USD = 60;
    private static final int RUB_EUR = 70;

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return (value / RUB_EUR);
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return (value / RUB_USD);
    }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        return (value * RUB_EUR);
    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        return (value * RUB_USD);
    }


}

