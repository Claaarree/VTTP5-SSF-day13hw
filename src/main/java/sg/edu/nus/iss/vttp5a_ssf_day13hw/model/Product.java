package sg.edu.nus.iss.vttp5a_ssf_day13hw.model;

public class Product {
    
    private String id;
    private String item;
    private Integer sold;
    private Integer quantity;
    private String picture;
    
    public Product(String id, String item, Integer sold, Integer quantity, String picture) {
        this.id = id;
        this.item = item;
        this.sold = sold;
        this.quantity = quantity;
        this.picture = picture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return id + ", " + item + ", " + sold + ", " + quantity + ", " + picture;
    }

    
}
