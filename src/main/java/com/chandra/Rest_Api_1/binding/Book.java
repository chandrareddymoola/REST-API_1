package com.chandra.Rest_Api_1.binding;

public class Book {
    private Integer bid;
    private String Bname;
    private  Double Price;

    public Book(){

    }

    public Book(Integer bid, String bname, Double price) {
        this.bid = bid;
        Bname = bname;
        Price = price;
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String bname) {
        Bname = bname;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", Bname='" + Bname + '\'' +
                ", Price=" + Price +
                '}';
    }
}
