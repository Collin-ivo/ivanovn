package ru.job4j.tracker;

import java.util.Random;
import java.util.RandomAccess;

/**
 * ru.job4j.tracker.Tracker
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "$"
 * @since 0.1
 */

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод реализаущий редактирование заявок
     *
     * @param item выбранная заявка
     * @param id   идентификационный номер редактируемой заявки
     */
    public void replace(String id, Item item) {
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getId().equals(id)) {
                this.items[index].setId(item.getId());
                break;
            }
        }
    }

    /**
     * Метод реализаущий удаление заявки
     *
     * @param id идентификационный номер удаляемой заявки
     */
    public void delete(String id) {
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getId().equals(id)) {
                for (int i = index + 1; i < this.items.length; i++) {
                    System.arraycopy(this.items, i, this.items, i - 1, this.items.length);
                }
                this.items[items.length - 1] = null;
                break;
            }
        }
    }

    /**
     * Метод возвращающий все заявки
     */
    public Item[] findAll() {
        int notNull = 0;
        int posDest = 0;
        for (Item it : this.items) {
            if (it != null) {
                notNull++;
            }
        }
        Item[] items2 = new Item[notNull];
        if (notNull > 0) {
            for (int index = 0; index < this.items.length; index++) {
                if (this.items[index] != null) {
                    System.arraycopy(this.items, index, items2, posDest, notNull);
                    posDest++;
                }
            }
        }
        return items2;
    }

    /**
     * Метод возвращающий все заявки от имени
     *
     * @param key ключевое слово поиска
     */
    public Item[] findByName(String key) {
        int keyNum = 0;
        int keyNumPos = 0;
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getName().equals(key)) {
                keyNum++;
            }
        }
        Item[] itemsByName = new Item[keyNum];
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getName().equals(key)) {
                System.arraycopy(this.items, index, itemsByName, keyNumPos, keyNum);
                keyNumPos++;
            }
        }
        return itemsByName;
    }

    /**
     * Метод возвращающий заявку по id
     *
     * @param id идентификационный номер заявки
     */
    public Item findById(String id) {
        int findIndex = -1;
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getId().equals(id)) {
                findIndex = index;
                break;
            }
        }
        if (findIndex < 0) {
            return null;
        } else {
            return items[findIndex];
        }
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        long curTime = System.currentTimeMillis();
        String rand = this.items[this.position].getId() + curTime;
        return rand;
    }
}
