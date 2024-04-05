package com.JavaMart.OOP_javaMart.dto;


public class PosDTO {
    private int num;      // 품목 번호
    private String name;        // 품목 이름
    private int quantity;       // 품목 수량
    private int price;      // 품목 가격
    private int sales;      // 품목 매출


    public PosDTO() {
    }

    public PosDTO(int num, String name, int quantity, int price, int sales) {
        this.num = num;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.sales = sales;
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
