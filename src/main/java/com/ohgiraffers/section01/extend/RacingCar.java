package com.ohgiraffers.section01.extend;

public class RacingCar extends Car{

    /* 목차 1. extends 키워드를 이용하여 Car 클래스 상속 */

    public RacingCar() {
        System.out.println("RacingCar 의 기본 생성자 호출됨 ...");



    }
    /* 목차 2. rnu() 오버라이딩 */
    @Override
    public void run() {

        System.out.println("레이싱카가 전속력으로 질주를 시작합니다 ~~");

    }
    /* 목차 3. sounHorn() , stop () 오버라이딩 */

    @Override
    public void soundHorn() {

        System.out.println("레이싱카는 경적을 울리지 않습니다...");

    }
    @Override
    public void stop() {

        System.out.println("레이싱카가 멈춥니다.");
    }


    /* 필기
        RacingCar 클래스는 상속만 받았을 뿐이지 거의 새로운 클래스를 만든거나 다름 없다.
        불필요하게 상속을 하는 거ㅕㅇ우 오히려 유지보수성에 악영향을 미친다.
     */
}
