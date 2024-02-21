package com.ohgiraffers.section02.overriding;

public class SuperClass {

    /* 목표 오버라이딩(overriding) 에 대해 알 수 있다. */
    /* 필기
        오버라이딩이란?
        부모클래스에서 상속 받은 메소드를 자식 클래스에서 재정의하여 사용하는 것이다.

        필기.
          오버라이딩 성립 요건
          1. 메소드의 이름이 동일해야 한다.
          2. 메소드의 리턴타입이 동일해야한다
          3. 매개변수 타입, 갯수, 순서가 동일 해야 한다 .
          4. pricate 메소드는 접근이 불가능하기 떄문에 오버라이딩이 불가능하다.
          5. fanal 키워드가 붙은 메소드는 어버라이딩이 불가능하다
          6. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야 한다.
     */

    /* 오버라이딩 테스트를 위한 기준 메소드 */
    public void method(int num){}

    private void privateMry (){}

    public final void  finalMehtod(){}
    protected  void  protecteMethod() {}
}
