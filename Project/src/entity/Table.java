package entity;

public class Table {
    private String table_id;
    private int table_num;
    private String amount_people;
    private String table_status;

    public Table(String table_id, int table_num, String amount_people, String table_status) {
        this.table_id = table_id;
        this.table_num = table_num;
        this.amount_people = amount_people;
        this.table_status = table_status;
    }

    public String getTable_id() {
        return table_id;
    }

    public void setTable_id(String table_id) {
        this.table_id = table_id;
    }

    public int getTable_num() {
        return table_num;
    }

    public void setTable_num(int table_num) {
        this.table_num = table_num;
    }

    public String getAmount_people() {
        return amount_people;
    }

    public void setAmount_people(String amount_people) {
        this.amount_people = amount_people;
    }

    public String getTable_status() {
        return table_status;
    }

    public void setTable_status(String table_status) {
        this.table_status = table_status;
    }
}
