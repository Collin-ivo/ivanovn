package ru.job4j.tracker;

/**
 * Item
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "$"
 * @since 0.1
 */

public class Item {
    private long id;
    private String name;
    private String desc;

    Item() {
    }
    Item(String nname, String ndesc, long nid) {
        name = nname;
        desc = ndesc;
        id = nid;
    }

    public String getId() {
        String getId = Long.toString(this.id);
        return getId;
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }

    public long setId(String in) {
        this.id = Long.valueOf(in);
        return this.id;
    }
    public String setName(String na) {
        name = na;
        return name;
    }
    public String setDesc(String di) {
        desc = di;
        return desc;
    }
}
