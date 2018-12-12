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
    Item(String inname, String indesc, long inid) {
        this.name = inname;
        this.desc = indesc;
        this.id = inid;
    }

    public String getId() {
        String gId = Long.toString(this.id);
        return gId;
    }
    public String getName() {
        return this.name;
    }
    public String getDesc() {
        return this.desc;
    }

    public void setId(String in) {
        this.id = Long.valueOf(in);
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
