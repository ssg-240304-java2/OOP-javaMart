package com.JavaMart.OOP_javaMart.dto;

import java.util.Date;

public class PosDTO {

//    private int milk;       // 우유
//    private int noodle;     // 라면
//    private int gum;        // 껌
//    private int chocolate;      // 초콜릿
//    private int water;      // 물

    private int num = 0;      // 품목 번호

    public Date getRevenueDate() {
        return revenueDate;
    }

    private Date revenueDate;
    private String name;        // 품목
    private int quantity;       // 수량
    private int price;      // 가격
    private int sales;      // 매출


    public PosDTO() {
    }

    public PosDTO(int num, String name, int quantity, int price) {
        this.num = num;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String information() {
        return
                "품목번호 : " + num + '\n' +
                "품목 : " + name + '\n' +
                "수량 : " + quantity + '\n' +
                "가격 : " + price + '\n' +
                "매출 : " + sales + '\n';
    }
}
