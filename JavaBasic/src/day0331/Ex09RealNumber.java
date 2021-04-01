package day0331;
// 기본형 데이터타입 02 - 실수
// 실수란, 소숫점이 존재하는 숫자를 실수라고 한다.
// 프로그래밍에서는 실수형 데이터타입에 float 와  double 2가지 데이터타입이 존재한다.
// float : 32비트
// double : 64비트
// 자바에서는 코드 안의 실수를 모두 double로 인식한다. -> 우리도 편하게 double을 쓰면 된다!


public class Ex09RealNumber {
    public static void main(String[] args) {
        //double 변수를 선언하고, 3, 3.14 2개의 값을 넣고 각각 출력해보기
        double myDouble = 3;
        System.out.println("myDouble의 현재값");
        System.out.println(myDouble);
        myDouble = 3.14;
        System.out.println("myDouble의 현재값");
        System.out.println(myDouble);
        
        // 또는 자바에게 우리가 입력한 실수가 double 타입인 것을 명확하게 말을 해주는 방법도 있다.
        // 이 때에는 실수값의 맨 뒤에 d를 붙이면 된다.
        myDouble = 1.234d;
        System.out.println("myDouble의 현재값");
        System.out.println(myDouble);
               
        
        // 이번엔 float 변수를 만들어서 해당 변수에 값을 초기화해보자
        // 단, 자바에서는 코드상의 실수를 double로 인식하므로
        // 곧장 실수값을 넣어줄 순 없고, 명시적 형변환을 하거나 아니면 해당 실수가
        // float 값인 것을 나타내주어야 한다.
        
        // 1. 명시적 형변환을 사용하는 방법
        float myFloat;
        myFloat = (float)3.45;
        System.out.println("myFloat의 현재값");
        System.out.println(myFloat);
        
        // 2. 실수값이 float 타입의 값인 것을 적어준다.
        //    이때에는 실수의 뒤에 f를 붙여주면 된다!
        myFloat = 78.1234f;
        System.out.println("myFloat의 현재값");
        System.out.println(myFloat);
        
 
    }
}
