package day0401;
// 자바의 콘솔의 형식에 맞추어서 출력할 필요가 있을 경우에는

// 우리가 printf를 사용하면 편하다.

// printf는 %문자를 사용하여 우리가 넘겨주는 값의 출력형태를 지정하게 된다.

public class Ex06Printf {
    public static void main(String[] args) {
        // 1. 10진법 정수('d'ecimal)
        System.out.println("1. Decimal");
        int number = 32;
        // A. 10진법 정수를 그대로 출력해라
        System.out.printf("A. [%d]\n", number);

        // B. 10진법 정수를 오른쪽 정렬 5자리로 출력해라
        System.out.printf("B. [%5d]\n", number);

        // C. 10진법 정수를 오른쪽 정렬 5자리로 출력해라
        // 단 자릿수 지정의 경우, 출력해야할 내용이 더 길면 지정된 자릿수는 무시하고
        // 출력할 내용을 온전하게 출력을 한다.
        System.out.printf("C. [%5d]\n", 1234567);
        // D. 10진법 정수를 왼쪽 정렬 5자리로 출력해라
        System.out.printf("D. [%-5d]\n", number);
        // E. 10진법 정수를 오른쪽 정렬 5자리로 맞추고
        // 왼쪽 빈 자리는 0으로 채워라
        System.out.printf("E. [%05d]\n", number);
        // 오른쪽 채우기는 없다. 큰 숫자로 오해할 수 있으므로. 32000으로

        System.out.println("--------------------------");

        // 2. 16진법 정수(he'x'adecimal)
        System.out.println("2. Hexadecimal");
        // 16진법에서 10이 넘어가는 숫자는 두자리가 되므로 10 -> A 부터 15->F까지로 치환
        // 101101 이 몇자리인지 헷갈릴 순 없잖아
        // RGB 값을 예전엔 0~255 까지의 숫자 세개로 0,0,0 등으로 표시했으나
        // 256개면 2^8 개이고, 16^2 개와 마찬가지라서 이제는 16진법으로
        // 숫자 세 개를 사용한다. 하지만 두자리 글자로 숫자들이 표현 가능.
        number = 30;
        // A. 16진법 정수를 그대로 출력하되 알파벳이 존재하면 소문자로 출력해라
        System.out.printf("A. {%x}\n", number);
        // B. 16진법 정수를 그대로 출력하되 알파벳이 존재하면 대문자로 출력해라
        System.out.printf("B. {%X}\n", number);
        // C. 16진법 정수를 5자리 왼쪽 정렬해서 출력하되 알파벳이 존재하면 소문자로 출력해라
        System.out.printf("C. {%-5x}\n", number);
        // D. 16진법 정수를 5자리 오른쪽 정렬해서 출력하되 알파벳이 존재하면 대문자로 출력해라
        System.out.printf("D. {%5X}\n", number);
        // E. 16진법 정수를 5자리 오른쪽 정렬해서 출력하되 알파벳이 존재하면 대문자로,
        // 왼쪽 빈 공간은 0으로 채워서 출력해라
        System.out.printf("E. {%05X}\n", number);

        System.out.println("--------------------------");

        // 3. 실수 ('f'loat)
        // 비록 float의 앞글자인 f를 따왔지만, 실제론 double이 들어갈 수 있다.
        System.out.println("3. float");
        double myDouble = 720 / (double) 7;
        // A. 실수를 그대로 출력해라
        System.out.printf("A. [%f]\n", myDouble);
        // B. 실수를 총 15자리, 오른쪽 정렬해서 출력해라
        System.out.printf("B. [%15f]\n", myDouble);
        // C. 실수를 총 15자리, 왼쪽 정렬해서 출력해라
        System.out.printf("C. [%-15f]\n", myDouble);
        // D. 실수를 총 15자리, 오른쪽 정렬, 왼쪽 빈 공간은 0으로 채워서 출력해라
        System.out.printf("D. [%015f]\n", myDouble);
        // E. 실수를 소수점 4번째 자리까지만 출력해라
        System.out.printf("E. [%.4f]\n", myDouble);
        // F. 실수를 총 15자리, 오른쪽 정렬, 왼쪽 빈 공간은 0으로, 소숫점 4번째 자리까지만 출력해라
        System.out.printf("F. [%015.4f]\n", myDouble);

        System.out.println("--------------------------");

        // 4. 스트링('s'tring)
        System.out.println("4. String");
        String str = new String("abcDEFghi");
        // A. 스트링을 그대로 출력해라
        System.out.printf("A. [%s]\n", str);
        // B. 스트링을 모두 대문자로 출력해라
        System.out.printf("B. [%S]\n", str);
        // C. 스트링을 오른쪽 정렬 12자리로 출력해라
        System.out.printf("C. [%12s]\n", str);
        // D. 스트링을 왼쪽 정렬 12자리 대문자로 출력해라
        System.out.printf("D. [%-12s]\n", str);
        // 단, 오른쪽 정렬하고 왼쪽 빈자리를 0으로 채워라는 불가능하다.
        // 문자라서.

        System.out.println("--------------------------");

        // printf를 사용할 때 주의할 점
        // 1. 존재하지 않는 % 문자를 사용하면 에러가 발생한다.
        // System.out.printf("%Z",123);
        // System.out.printf("월 수입: %13원",1000000);
        System.out.printf("월 수입: %13d원\n", 1000000);

        // 2. %문자와 넘겨받는 값의 종류가 다르면 에러가 발생한다.
        // System.out.printf("%d", 1.23);
        // System.out.printf("%f", 3);

        // 3. %문자의 갯수보다 넘겨받는 값의 갯수가 많으면?
        // 아무런 문제 없다.그냥 쿨하게 거기까지만. 앞에서부터 차례대로 들어간다.
        System.out.printf("1. %d 2. %d 3. %d\n", 1, 2, 3, 4, 5, 6, 7);

        // 4. %문자의 갯수보다 넘겨받는 값의 갯수가 적으면? 에러발생
        // System.out.printf("%d %d %d", 1);

    }
}
