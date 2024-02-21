package com.ohgiraffers.section01.extend;

public class Car {

    // 자동차의 달리는 상태를 확인할 수 있는 필드
    private boolean runningStatus;

    // 기본 생성자
    public Car() {
        System.out.println("Car  클래스의 기본 생성자 호출됨...");
    }

    public void run() {

        //자동차는 기본적으로 달리는 기능을 수행할 수 있다.
        runningStatus = true;
        System.out.println("자동차가 달리기 시작합니다...");


    }
    public void soundHorn() {

        // 자동차는 주행중인 상태일 때 기본적인 경적을 울리는 기능을 수행할 수 있다.
        if(isRunning()){
            System.out.println("빵빵빵빵빵");
        } else {
            System.out.println("주행중인 상태가 아닌 경우에 경적을 울릴 수 없다. ");
        }
    }
        // Car 가 달리는 상황은 본인만 컨트롤 할 수 있다.(의인화)
    protected boolean isRunning() {
        // 자동차의 주행 중 상태를 반환할 수 있는 기능을 수행할 수 있다.
        return runningStatus;
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다...");
    }
}
