package day0401;
// 연산자 03 - 비교연산자
// 비교연산자는 우리가 넣은 연산자를 이용해 2개의 값을 비교하여 true 인지 false 인지를 판단해준다.
// >, >=, <, <=, ==, != 6가지 연산자가 있다.


// 단, 컴퓨터가 알아서 왼쪽이 큰지 오른쪽이 큰지를 판단해주는 것이 아니라
// 우리가 연산자를 넣어서 그게 참인지 거짓인지를 결과를 보여주게 된다.

public class Ex03Operator03 {
    public static void main(String[] args) {
        //int 변수 2개를 만들어보자
        int number1 =4;
        int number2 =6;
        
        // 비교연산자는 "값"을 비교하기 때문에
        // 우리가 한쪽에 변수를 넣고 한쪽에 직접 값을 넣거나
        // 양쪽에 모두 변수를 넣거나
        // 양쪽에 모두 값을 넣어도 된다.
        // 단, 전통적으로 변수를 왼쪽에 적어준다.
        
        // 1. >
        //    > 은 왼쪽이 크면 true, 그 외는 false이다.
        System.out.println("1. > ");
        System.out.println("number1 > number2: " + (number1 > number2));
        // 구어체로 풀어보면?
        // "number1이 number2보다 큽니까?"
        System.out.println("number1 > 0: " + (number1 > 0));
        // number1이 0보다 큽니까?
        System.out.println("number1 > 4: " + (number1 > 4));
        // number1이 4보다 큽니까?
        System.out.println();
        
        
        // 2. >=
        //    >= 은 왼쪽이 크거나 같으면 true, 그 외는 false이다.
        System.out.println("2. >= ");
        System.out.println("number1 >= number2: " + (number1 >= number2));
        // 구어체로 풀어보면?
        // "number1이 number2보다 크거나 같습니까?"
        System.out.println("number1 >= 0: " + (number1 >= 0));
        // number1이 0보다 크거나 같습니까?
        System.out.println("number1 >= 4: " + (number1 >= 4));
        // number1이 4보다 크거나 같습니까?
        System.out.println();
        
        // 3. <
        //    < 은 왼쪽이 작으면 true, 그 외는 false이다.
        System.out.println("3. < ");
        System.out.println("number1 < number2: " + (number1 < number2));
        // 구어체로 풀어보면?
        // " number1이 number2보다 작습니까?"
        System.out.println("number1 < 0: " + (number1 < 0));
        // number1이 0보다 작습니까?
        System.out.println("number1 < 4: " + (number1 < 4));
        // number1이 4보다 작습니까?
        System.out.println();
        
        
        // 4. <=
        //    <= 은 왼쪽이 작거나 같으면 true, 그 외는 false이다.
        System.out.println("4. <= ");
        System.out.println("number1 <= number2: " + (number1 <= number2));
        // 구어체로 풀어보면?
        // "number1이 number2보다 작거나 같습니까?"
        System.out.println("number1 <= 0: " + (number1 <= 0));
        // number1이 0보다 작거나 같습니까?
        System.out.println("number1 <= 4: " + (number1 <= 4));
        // number1이 4보다 작거나 같습니까?
        System.out.println();
        
        
        // 5. ==
        // == 은 왼쪽과 오른쪽의 값이 같으면 true, 아니면 false이다
        System.out.println("5. ==");
        System.out.println("number1 == number2: " +(number1 == number2));
        // "number1의 현재값과 number2의 현재값이 같습니까?"
        System.out.println("number1 == 0: " + (number1 == 0));
        // "number1의 현재값과 0이 같습니까?"
        System.out.println("number1 == 4: " + (number1 == 4));
        // "number1의 현재값과 4가 같습니까?"
        System.out.println();
        
        
        // 6. !=
        // != 는 왼쪽과 오른쪽의 값이 다르면 true, 아니면 false이다.
        System.out.println("6. !=");
        System.out.println("number1 != number2: " +(number1 != number2));
        // "number1의 현재값과 number2의 현재값이 다릅니까?"
        System.out.println("number1 != 0: " + (number1 != 0));
        // "number1의 현재값과 0이 다릅니까?"
        System.out.println("number1 != 4: " + (number1 != 4));
        // "number1의 현재값과 4가 다릅니까?"
        System.out.println();
        
        
        // 단 비교연산자를 사용할 때 한가지 주의할 점은
        // "참조형 데이터타입"의 변수 혹은 값에 대해서는 부정확한 결과값이 나올 수도 있게 된다는 것이다.

        
        // 참조형 데이터타입은
        // 클래스형, 배열형, 인터페이스형 3가지 종류가 있다.
        // String은 클래스이다.
        // 그러므로 String형 변수는 참조형 데이터타입의 변수이다.
        
        // String 형 변수를 초기화(할당)하는 3가지 방법
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = str2;
        
        
        // 각각의 값을 출력을 해보자
        System.out.println("str1~str3의 현재 저장된 값: ");
        System.out.println("str1: ["+str1+"]");
        System.out.println("str2: ["+str2+"]");
        System.out.println("str3: ["+str3+"]");
        System.out.println();
        
        // 비교연산자를 통해서 3개의 값을 비교해보자
        System.out.println("비교연산자를 통한 String 변수 비교 결과");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str2 == str3: " + (str2 == str3));
        System.out.println();
        
        // stack영역에서 지정해준 변수들의 값은
        // heap 영역에 기본형 변수는 값으로 (이진법) 으로 저장되고 
        // 참조형 변수는 주소 값의 키워드를 상수풀에서 가져와 생성하여 저장되므로.
        // 비교연산자는 stack 영역에 불려진 값만 비교한다.
        
        
        
        // 참조형 변수는 stack 영역에는 heap 영역으로 향하는 주소값이 저장되어 있고
        // 우리가 그 참조형 변수의 실제 저장되어있는 값이나 메소드 특성 등을 알아보려면
        // 그 heap 영역을 "참조" 해서 확인해야한다.
        
        // 하지만 비교연산자는 옛날에 나온 연산자이기 때문에 
        // stack 영역의 값만 확인하게 만들어져 있다.
        // 그렇기 때문에 우리가 위에서 str1, str2, str3을 만든 방식이
        // 다르기 때문에 str2와 str3은 같은 주소값을 가지고 있고, str1은 혼자 다른 주소값을 가지고 있다.
        // 따라서 비교연산자를 통해 str1과 str2, 혹은 str1과 str3을 같은지 비교하면
        // 주소값이 다르기 때문에 false가 나온다.
        // 반대로, 같은 주소값을 가지고 있는 str2와 str3은 비교연산자를 통해 같은지 비교하면        // true가 나오게 된다.
        
        // 하지만, 참조형 변수는 주소값이 중요한 것이 아니라 그 주소값이 적혀있는 곳에 있는 실제 값이 중요한 것이다.
        // 따라서 참조형 변수는 == 혹은 != 비교 연산자를 통해 비교를 하지 않는 것이 옳다.
        
        // 그렇다면 우리가 참조형 변수의 실제 값 비교를 할 때에는 어떻게 해야할까?
        // 이 때에는 우리가 비교연산자가 아니라 해당 변수의 equals() 라는 메소드를 통해서 비교를 해야한다.
        // 변수의 equals() 메소드를 사용할 때에는 다음과 같은 방식으로 사용해야한다.
        // 변수.equals(비교대상)
        System.out.println("equals() 메소드를 통한 비교");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str2.equals(str3): " + str2.equals(str3));
        
        // 범위 비교는 어떻게 해야할까?
        number1 = 3;
        //System.out.println("0 <= number1 < 10: " + (0 <= number1 < 10));
        // 우리가 현실에서는 범위에 속하는지 체크할 때는 위의 코드처럼 적어주지만
        // 프로그래밍 문법 상 위의 코드는 에러가 난다.
        // 왜냐하면
        // 왼쪽에서 오른쪽으로 순차적으로 실행이 되기 때문에 다음과 같은 단계로 인식된다.
        // 1. 0 <= number1 체크
        //    number1이 3이므로 true가 나온다.
        // 2. true < 10 체크 -> "참이랑 10이랑 뭐가 큰지 내가 어떻게 아냐! 에러!"
        
        //    
    
    }
  
}
