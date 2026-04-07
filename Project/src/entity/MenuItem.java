package entity;

public class MenuItem {
    private int menu_id;
    private String name;
    private double price;
    private String type;
    private String status_menu;

    public MenuItem(int menu_id, String name, double price, String type, String status_menu) {
        this.menu_id = menu_id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.status_menu = status_menu;
    }

    public MenuItem(String name, double price, String type, String status_menu) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.status_menu = status_menu;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus_menu() {
        return status_menu;
    }

    public void setStatus_menu(String status_menu) {
        this.status_menu = status_menu;
    }
}