package  com.mycompany.test1.models;

public class Product {

    private String name;
    private float price;
    private String category;
    private String brand;
    private int size;
    private int id;
    private String color;
    private int views;
    private int orders;

    public int getViews() {
        return views;
    }

    public int getOrders() {
        return orders;
    }

    public void incrementViews() { views++; }

    public void incrementOrders() { orders++; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setOrders(int orders) { this.orders = orders; }

    @Override
    public boolean equals(Object obj) {

        Product product = (Product) obj;
        if(id == product.getId())
            return true;
        else
            return false;
    }
}
