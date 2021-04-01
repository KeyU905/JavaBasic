package day0401;
// 연산자 04 - 논리연산자
// 논리연산자는 boolean 값에 대한 연산을 한다.
// 논리연산자에는 AND 연산자, OR 연산자, NOT 연산자 3가지가 있다.
// AND 연산자 : && 으로 적고, 2개의 boolean 값이 모두 true일 때에만 true 결과값이 된다.
// OR  연산자 : || 으로 적고, 2개의 boolean 중 하나라도  true이면 true가 결과값이 된다.
// NOT 연산자 : ! 로 적고, 해당 boolean 값을 반전시킨다.


public class Ex04Operator04 {
    public static void main(String [] args) {
        // 1. AND 연산자
        System.out.println("1. AND 연산자");
        System.out.println("true && true: " +  (true && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("false && false: " + (false && false));
        // 밑의 두 줄에 노란 줄이 가는 이유 - && 이기 때문에 두 조건 모두 보는데, 앞에 false가 오기 때문에
        // 뒤의 조건은 볼 필요 없이 false가 되기 때문에 Dead code라고 하는 것. 필요 없다는 말.
        System.out.println();
        
        // 2. OR 연산자
        System.out.println("2. OR 연산자");
        System.out.println("true || true: " +  (true || true));
        System.out.println("true || false: " + (true || false));
        // 마찬가지로 이미 앞에서 true 결과가 나왔기 때문에 뒤는 무의미한 코드가 된다.
        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));
        System.out.println();
        
        // 3. NOT 연산자
        System.out.println("3. NOT 연산자");
        System.out.println("!true: " + !true);
        System.out.println("!false: " + !false);
        boolean myboolean = true;
        System.out.println("myboolean의 현재값: " + myboolean);
        System.out.println("!myboolean: " + !myboolean);
        System.out.println("myboolean의 현재값: " + myboolean);
        System.out.println();
        
        
        // 어떠한 값이 범위에 속하는지 확인하는 코드
        // 0 <= number < 10 이란 것은
        // 넘버가 0보다 크거나 같'고' 10보다 작다 라는 의미이다.
        // 즉
        // AND 연산자가 필요하다!
        System.out.println("숫자가 특정 범위에 속하는지 확인하는 방법");
        int number = 4;
        System.out.println("number의 현재값: " + number);
        System.out.println("number >= 0 && number <10: " + (number >= 0 && number <10));
        System.out.println();
        
                
        number = -20;
        System.out.println("number의 현재값: " + number);
        System.out.println("number >= 0 && number <10: " + (number >= 0 && number <10));
        System.out.println();
        
        number = 20;
        System.out.println("number의 현재값: " + number);
        System.out.println("number >= 0 && number <10: " + (number >= 0 && number <10));
        System.out.println();
        
        
    }
}
