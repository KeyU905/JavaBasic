package day0401;
// 연산자 01 - 산술연산자
// 산술연산자는 2개의 값에 대한 간단한 산술연산을 한다.
// 산술연산이란
// 더하기, 빼기, 곱하기, 몫, 나머지 5가지 연산이 있다.
// +: 더하기
// -: 빼기
// +: 곱하기
// /: 몫
// %: 나머지

// 다만 여러분들이 한가지 유의하실 점은
// 정수와 정수를 산술연산하면 결과는 무조건 정수가 된다.
// 실수와 정수 혹은 실수와 실수를 산술연산하면 결과는 무조건 실수가 된다.

public class Ex01Operator01 {
	public static void main(String[] args) { 
	  // 1. 정수와 정수의 산술 연산
		System.out.println("1. 정수와 정수");
		int number1 = 5;
		int number2 = 7;
		
		System.out.println("A. number +  number2:" + (number1 + number2));
		System.out.println("B. number -  number2:" + (number1 - number2));
		System.out.println("C. number *  number2:" + (number1 * number2));
		System.out.println("D. number /  number2:" + (number1 / number2));
		System.out.println("E. number %  number2:" + (number1 % number2));
		
		//2. 실수와 실수의 산술연산
		System.out.println("2.실수와 실수");
		double myDouble1 = 5.0;
		double myDouble2 = 7.0;
		
		System.out.println("A. myDouble1 +  myDouble2:" + (myDouble1 + myDouble2));
		System.out.println("A. myDouble1 -  myDouble2:" + (myDouble1 - myDouble2));
		System.out.println("A. myDouble1 *  myDouble2:" + (myDouble1 * myDouble2));
		System.out.println("A. myDouble1 /  myDouble2:" + (myDouble1 / myDouble2));
		System.out.println("A. myDouble1 %  myDouble2:" + (myDouble1 % myDouble2));
		
		// 정수와 실수의 산술연산
		
        System.out.println("3.정수와 실수");
		System.out.println("A. number +  myDouble2:" + (number1 + myDouble2));
        System.out.println("B. number -  myDouble2:" + (number1 - myDouble2));
        System.out.println("C. number *  myDouble2:" + (number1 * myDouble2));
        System.out.println("D. number /  myDouble2:" + (number1 / myDouble2));
        System.out.println("E. number %  myDouble2:" + (number1 % myDouble2));
        System.out.println();
        
		
        // 산술 연산시 주의할 점
        // 1. 우리가 학교에서 배웠듯이 *, /, %가 우선순위가 높고, +, - 는 낮다
         System.out.println("1*2 + 3/4 - 5%2: " + (1*2 + 3/4 - 5%2));
        // 2. 중괄호 대괄호는 쓸 수 없지만 중괄호를 중첩해서 사용가능하다.
         System.out.println("2 * (3 + (4 / 2)) - 5: " + (2 * (3 + (4 / 2)) - 5));
        // 3. 가장 흔히 하는 실수로 다음과 같은 실수가 발생될 때가 있다.
         double average = (1 + 2 + 3) / 3;
         System.out.println("1 + 2 + 3 의 평균: " + average);
        // 위의 코드에서는 우리가 average의 실수부가 항상 .0으로 된다.
        // 왜냐하면 우리가 average에 할당하는 값이
        // 1 + 3 + 3 -> int
        // 3 -> int
        //즉 int / int 이기 때문에
        // 소수점이 존재하지 않는 정수의 형태로
        // 몫만 나오게 된다.
		
         //따라서 평균과 같이 실수가 존재하는 나눗셈 혹은 곱셈을 해야할 때에는
         // 우리가 명시적 형변환은 통해서 합이나 갯수를 double로 바꿔서
         // 나눗셈을 해주어야 한다.
         
         average = ( 1 + 3 + 3) /  (double)3;
         System.out.println("1 + 3 + 3 의 평균:" + average);
         average = ( 1 + 3 + 3) /  3.0;
         System.out.println("1 + 3 + 3 의 평균:" + average);
         
         // String 클래스
         // String 클래스는 여러개의 문자를 한번에 다루는 클래스로써
         // 우리가 흔히 쓰는 ""가 바로 String 타입의 값이 된다.
         // String 클래스는 + 연산자가 정의되어 있는데 그 의미는
         // 값을 더하라가 아닌
         // 앞에 값 뒤에 뒤의 값을 이어서 글자들로 만들어라 라는 뜻이 된다.
         // 예를 들어서 
         // "abc" + "123" -> "abc123" 으로 만들어라
         // "가나다" + 999 -> "가나다999"로 만들어라
         // 13 + "Monkeys" -> "13Monkeys"로 만들어라
         // 라는 의미가 된다.  사칙연산 중 + 만 가능하다.
		
		
	}
	

}
