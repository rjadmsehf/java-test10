package com.ohgiraffers.section03.superkayword;

import java.util.Date;

public class Product {

    private String code;                // 상품코드
    private String brand;               // 제조사
    private String name;                // 상품명
    private int price;                  // 가격
    private Date manufacturingDate;     // 제조일자

    // 기본생성자
    public Product() {
        System.out.println("Product 클래스의 기본 생성자 호출됨...");
    }
    // 모든 필드를 초기화 하는 생성자
    public Product(String code, String brand, String name, int price, Date manufacturingDate) {

        super();
        /* 필기.
         *   아무 클래스도 상속 받지 않았는데  super() 키워드가 호출 가능
         *   java.lang.Object 클래스의 생성자를 호출하는 것이다.
         *   모든 클래스는 Object 클래스의 후손이기 때문이다.
         *  */

        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product 클래스의 모든 필드 초기화 하는 생성자 호출됨...");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getInfo() {

        return "Product [code=" + code + ", brand=" + brand + ", name=" + name + ", price=" + price
                + ", manufacturingDate=" + manufacturingDate + "]";
    }

}