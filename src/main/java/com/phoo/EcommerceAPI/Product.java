package com.phoo.EcommerceAPI;

import java.util.Objects;

public class Product {

    private int id;
    private String name;
    private double price;
    private String category;
    private int stock;

    /// Default Constructor
    public Product(){};

    /// Parameter Constructor
    public Product(int id,String name,double price,String category,int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    /// Getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public int getStock(){
        return stock;
    }
    /// Setter
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setStock(int stock){
        this.stock = stock;
    }

    /// equal and hash

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(price, that.price)
                && Objects.equals(category,that.category)&& Objects.equals(stock,that.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price,category,stock);
    }


}
