package day0331;
// 기본형 데이터타입 04 - 논리형
// 논리형 데이터타입인 boolean 데이터타입은
// true/false 딱 2가지 값만 저장 가능하다.
// 단, boolean 타입도 해당 타입의 변수를 그대로 만들어서 쓰기 보다는
// 우리가 나중에 배우게 될 연산자 라는 기능 혹은 메소드의 결과값을 그대로 쓰는 경우가 대부분이다.

public class Ex11Boolean {
    public static void main(String[] args) {
        //boolean 변수의 선언
        boolean myBoolean;
        // boolean 변수의 초기화
        // 이때는 true 변수 혹은 false 키워드를 사용하여 초기화를 하게 된다.
        myBoolean = true;
        System.out.println("myBoolean의 현재값");
        System.out.println(myBoolean);
        
        myBoolean = false;
        System.out.println("myboolean의 현재값");
        System.out.println(myBoolean);
    
    }
}
