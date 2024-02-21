package com.ohgiraffers.section03.superkayword;

import java.util.Date;

public class Computer extends Product {

    // 컴퓨터는 하나의 제품이지만, 모든 제품이 컴퓨터는 아니다. (IS-A)

    private String cpu;                 // cpu
    private int hdd;                    //hdd
    private int ram;                    //ram
    private String operationSystem;     //운영체제


    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {

        // 부모의 기본생성자 호출
        super();

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출함...");
    }
    // 부모가 가지고 있는 필드
    public Computer(String code, String brand, String name, int price, Date menufacturingDate,
            /* 자식의 필드 */ String cpu, int hdd, int ram, String operationSystem) {

        // 부모의 모든 필드를 초기화 하는 생성자로 Product클래스가 가진 필드를 초기화 할 값 전달.
        super(code, brand, name, price, menufacturingDate);

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 부모필드도 같이 초기화 하는 생성자 호출함...");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInfo() {

        return super.getInfo()
                + "Computer ["
                + "cpu=" + this.cpu
                + ", hdd=" + this.hdd
                + ", ram=" + this.ram
                + ", operationSystem=" + this.operationSystem
                + "]";
    }

}