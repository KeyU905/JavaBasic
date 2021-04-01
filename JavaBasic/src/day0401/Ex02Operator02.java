package day0401;
// 연산자 02 - 할당 연산자
// 할당 연산자는 오른쪽 값을 왼쪽 공간에 할당하는 연산자인데
// 여러가지 연산 후에 할당이 가능하다.
// =, +=, -=, *=, /=, %=, ++, --
public class Ex02Operator02 {
    public static void main(String[] args) {
        int number;
        System.out.println("1. =");
        // 1. = 
        // 프로그래밍에서 =은 오른쪽 값을 왼쪽에 할당해라 라는 의미이다.
        number = 7;
        System.out.println("number의 현재값 : " + number);
        System.out.println();
        
        //2. +=
        // +=은 왼쪽 공간의 현재값에 오른쪽 값을 더한 결과 값을 다시 왼쪽 공간에 넣어라 라는 의미이다.
        System.out.println("2. +=");
        number += 3;
        System.out.println("number의 현재값: " + number);
        System.out.println();
        
        // 3. -=
        // -= 은 왼쪽 공간의 현재값에 오른쪽 값을 뺀 결과값을 다시 왼쪽 공간에 넣어라 라는 의미아디.
        System.out.println("3. -=");
        number -= 4;
        System.out.println("number의 현재값: " + number);
        System.out.println();
        
        // 4. *=
        // *=은 왼쪽 공간의 현재값에 오른쪽 값을 곱한 결과값을 다시 왼쪽 공간에 넣어라 라는 의미이다.
        System.out.println("4. *=");
        number *=7;
        System.out.println("number의 현재값:" + number);
        System.out.println();
       
        // 5. /=
        // /=은 왼쪽 공간의 현재값에 오른쪽 값을 나눈 몫을 다시 왼쪽 공간에 넣어라 라는 의미이다.
        System.out.println("5. /=");
        number /= 4;
        System.out.println("number의 현재값:" + number);
        System.out.println();
        
        // 6. %=
        // %=은 왼쪽 공간의 현재값에 오른쪽 값을 나눈 나머지를 다시ㅏ 왼쪾 공간에 넣어라 라는 의미이다.
        System.out.println("6. %=");
        number %= 4;
        System.out.println("number의 현재값 : " + number);
        System.out.println();
        
        
        // 7. ++, --
        // ++ 와 -- 는 특이한 형태의 할당연산자인데, 해당 공간의 값을 정확히 1만 증가시키거나 감소시킨다.
        // 하지만 ++ 혹은 -- 가 변수의 앞에 붙냐 뒤에 붙냐에 따라서 의미가 달라지게 된다.
        
        // 만약 ++ 혹은 -- 가 변수의 앞에 붙을 때에는 전위 증가(감소) 연산자라고 하며
        // 해당 줄에서 코드의 실행순서가 가장 먼저가 된다.
         System.out.println("전위 증가 연산자의 경우");
         System.out.println("number의 현재값: " + number);
         System.out.println("++number: " + ++number);
         // 비록 위의 코드는 한 줄로 적혀있지만 실제론 여러 단계를 거치게 된다.
         // 1번 : ++number가 실행되면서 number의 현재값이 2에서 3이 된다.
         // 2번 : "++number: " + number가 실행이 되기 위해 number의 현재값인 3을
         //       스트링 값 "3"으로 만들어준다.
         // 3번 : "++number: " 뒤에 스트링 값 "3"을 이어서 "++number: 3" 이라는 스트링 값을 만들어준다.
         // 4번 : "++number: 3" 이라는 스트링 값을 System.out.println()이 화면에 출력해준다. 
         
         System.out.println("number의 현재값: " + number);
         System.out.println();
         
        
        
        // 만약 ++ 혹은 -- 가 변수의 뒤에 붙을 때에는 후위 증가(감소) 연산자라고 하며
        // 해당 줄에서 코드의 실행순서가 가장 나중이 된다.
         System.out.println("후위 증가 연산자의 경우");
         System.out.println("number의 현재값: " + number);
         System.out.println("number++ : " + number++);
         // 1. "number++: " 뒤에 이어 붙이기 위해서 number의 현재값인 3을 기반으로
         //     String 값 "3" 을 만들어낸다.
         // 2. "number++: " 뒤에 "3" 이 이어져서  "number++: 3" 이라는 String 값이 만들어진다.
         // 3. System.out.println()이 "number++: 3" 을 화면에 출력시킨다.
         // 4. number++ 가 실행되어서 number의 현재값이 3에서 4로 증가된다.
         System.out.println("number의 현재값: " + number);
         System.out.println();
         
         // 다음 코드의 결과값을 맞추시오.
         int number1 = 4;
         int number2 = 5;
         System.out.println("number1++ + --number2: "+ (number1++ + --number2));
         
        
    }
}
