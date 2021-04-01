package day0331;
// 기본형 데이터타입 01 - 정수형
// 프로그래밍에서는 기본적으로 4가지 종류의 정수형 데이터타입을 지원한다.
// byte :   8비트 (총 2^8개의 숫자를 저장 가능)  -> -2^7  ~ 2^7  - 1
// short : 16비트 (총 2^16개의 숫자를 저장 가능) -> -2^15 ~ 2^15 - 1
// int :   32비트 (총 2^32개의 숫자를 저장 가능) -> -2^31 ~ 2^31 - 1
// long :  64비트 (총 2^64개의 숫자를 저장 가능) -> -2^63 ~ 2^63 - 1

// 비트란? 2진법 자릿수를 뜻한다.
//      비트는 컴퓨터의 저장체계에서 최소단위에 속한다.
//      8비트는 1 바이트 이다.


// 프로그래밍에서 만약 우리가 표현 가능한 범위를 벗어나게 되면
// 버그 혹은 에러가 발생하게 된다.
// 버그는 overflow 혹은 underflow 라고 표현한다.


// 자바에서는 기본적으로 코드에 적혀있는 10진법 숫자를 int로 인식하기 때문에
// 여러분들은 굳이 byte나 short를 사용할 필요가 없고
// +- 20억 사이의 숫자이면 int를, 그 범위를 벗어나는 경우에는 long을 사용하면 된다!


public class Ex07Integer {
        public static void main(String[] args) {
            //byte 변수 myByte를 선언해보자
            //byte 변수니깐 데이터타입은 byte
            // 그리고 변수이름은 myByte
            byte myByte;
            // myByte에 10으로 초기화해보자
            myByte = 10;
            
            // myByte의 현재값을 화면에 출력해보자
            System.out.println(myByte);
            
            // 변수의 경우, 우리가 한번 선언하고 나서는
            // 똑같은 이름의 변수는 그 변수가 유효한 범위 안에서는
            // 다시 선언해줄 수 없다.
            // 따라서 아래의 코드는 에러가 발생한다.
            // byte myByte;
            
            
            //myByte에 새로운 값 30을 할당해보자
            myByte =30;
            
            //myByte의 현재값을 화면에 출력해보자
            System.out.println(myByte);

            // myByte에 byte의 범위를 벗어나는 값을 넣어보자
            //myByte = 30000;
            // byte의 벗어난 30000이란 값을 넣으려고 하면 에러가 발생한다.
            
            
            // 즉 우리가 정수형 변수 혹은 상수가 필요할 때에는
            // 머리아프게 범위를 계산하지 말고
            // +- 20억 안이라면 int, 그 외에는 long을 사용하면 된다.
            
            // 상수도 체험해보자
            // 상수는 한번 값이 고정되면 더이상 변경할 수 없게 된다.
            final int MY_INT =24;
            
            System.out.println(MY_INT);
            
            // 상수에 새로운 값 45를 넣으려고 하면?
            
            // MY_INT = 45;
            // 에러가 발생한다. 
            
            
        }
    
}