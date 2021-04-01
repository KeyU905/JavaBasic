package day0331;
// 형변환(Type Casting)
// 형변환이란 특정 데이터타입의 값을 다른 데이터타입으로 바꿔주는 것을 형변환이라고 한다.
// 형 변환에는 암시적 형변환과 명시적 형변환 2가지가 존재한다.

// 암시적 형변환(implicit type casting)
// 암시적 형변환이란 특별한 명령어를 적어주지 않더라도
// 자바가 내부적으로 특정 값의 데이터타입을 바꿔주는 것을
// 암시적 형변환이라고 한다.
// 암시적 형변환은 더 작은 데이터타입의 값을 더 큰 데이터타입의 공간에 담거나
// 정수를 실수로 변환할 때 발생된다.

// 명시적 형변환(explicit type casting)
// 명시적 형변환이란 우리가 특별히 명령어를 적어주어야지
// 형변환이 발생되는 것을 말한다.
// 명시적 형변환을 발생시킬 때에는 공간 = (바꿀 데이터타입)값;
// 으로 발생시킬 수 있다.
// 암시적 형변환이 발생하지 않는 모든 경우에는 반드시 명시적 형변환을 해주어야 한다.
//

public class Ex08TypeCasting {
    public static void main(String[] args) {
        //byte 변수를 선언하고 5 라는 값을 초기화해보자
        byte myByte = 5;
        // myByte의 현재값을 출력해보자
        System.out.println("myByte의 현재값.");
        System.out.println(myByte);
        
        // int 변수를 선언하고 해당 공간의 값을 myByte의 현재값으로 초기화해보자
        int myInt = myByte;
        // int는 32비트, byte는 8비트이므로
        // myByte의 값은 얼마가 들어가든 간에 int로 다 표현 가능하다.
        // 따라서 위의 코드처럼 적어주면 암시적 형변환이 일어나서
        // myByte의 값이 int의 형태로 바뀌게 된다.
        System.out.println("myInt의 현재값.");
        System.out.println(myInt);
        
        // 하지만 더 큰 데이터타입의 값을 더 작은 공간에 담을 때에는
        // 우리가 매번 명시적 형변환을 해야한다.
        
        // 예시) myInt의 현재값을 myByte에 옮겨 담을 때 
        // 이럴 때에는 myInt 앞에 byte를 명시적 형변환 해주어야 한다!
        myByte = (byte)myInt;
        
        // overflow와 underflow
        // overflow: 해당 데이터타입의 최대값보다 큰 값이 들어와서 값이 음의 영역으로 향하는 것
        // 그렇다면 myByte에 130을 넣으면 어떻게 될까?
        // myByte = 130;
        // 자바는 기본적으로 오버플로우가 발생하면 에러를 발생시키지만
        // 우리가 강제로 명시적 형변환을 통해서 오버플로우를 발생시킬 수 있다.
        myByte = (byte)130;
        System.out.println("오버플로우가 발생된 myByte의 현재값");
        System.out.println(myByte);
        // byte의 범위 : -128 ~ 127
        // 130 : 127 + 1 + 2
        //      =(127+1) + 2
        //      127+1은 오버플로우가 발생하여
        //      128이 아닌 -128이 됨
        //      = -128 + 2
        //      = -126
        
        // underflow: 해당 데이터타입의 최소값보다 작은 값이 들어와서 값이 양의 영역으로 향하는 것
        // 오버플로우와 마찬가지로, byte의 최소값보다 더 작은 값을
        // byte로 명시적 형변환하여 값이 양의 정수로 향하는 것을 확인해보자
        // myByte = -140;
        // 위의 코드는 에러가 난다.
        myByte = (byte)-140;
        System.out.println("언더플로우가 발생된 myByte의 현재값");
        System.out.println(myByte);
        // -140은
        // -128 - 1 - 11 이다.
        // = (-128 - 1) - 11
        //   (-128 - 1)을 하면 언더플로우가 발생하여 -129가 아닌 127이 된다.
        //   즉 127 - 11이 된다.
        // = 127 - 11 = 116
        
               
    }
}
