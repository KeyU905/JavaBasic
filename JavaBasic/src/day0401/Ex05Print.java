package day0401;
// 자바 콘솔에 출력하는 가장 대중적인 3가지 방법
// 1. print() : print()는 가장 기본적인 출력 방법으로써, ()의 내용을 그대로 출력하고
//              만약 다음에 출력할 내용이 존재하면 출력한 내용의 바로 오른쪽 칸부터 출력을 시작한다.
// 2. println() : println()은 "print a line"의 줄임말로써, ()의 내용을 그대로 출력하고
//              만약 다음에 출력할 내용이 존재하면 그 다음줄의 첫번째칸부터 출력을 시작한다.
// 3. printf() : printf()는 "print in format"의 줄임말로써, ()의 내용을 형식에 맞추어 출력하고
//              만약 다음에 출력할 내용이 존재하면 출력한 내용의 바로 오른쪽 칸부터 출력을 시작한다.


// 이스케이프 문자
// 이스케이프 문자란 \ 와 조합돼서 특별한 의미를 가지는 몇개의 특수문자들을 이스케이프 문자라고 한다.
// 대표적으로, 그 문자가 등장하는 즉시 줄을 강제로 바꾸는 개행 문자, 일반적인 스페이스보다 크기가 큰 탭 공백 문자,
// 코드상에서는 스트링 값의 시작과 끝을 알리기 때문에 단독으로 사용할 수 없는 쌍따옴표 문자 등이 존재한다.

public class Ex05Print {
    public static void main(String[] args) {
        // 이번 예제에서 출력할 내용을 담은 String 변수 2개
        String str1 = new String("ABC");
        String str2 = new String("def");
        //1. print()
        System.out.print(str1);
        System.out.print(str2);
        
        //2. println()
        System.out.println(str1);
        System.out.println(str2);
        
        // 이스케이프 문자를 체험해보자
        // str1에 다양한 공백문자를 넣어보자
        str1 = new String("A 안킬로사우르스\tB 브라키오사우르스\n");
        str2 = new String("C 콤프소그나투스\tD 데이노니쿠스\n");
        System.out.print(str1);
        System.out.print(str2);
        
        // 2. 스트링 안에 쌍따옴표 넣기
        // 예를 들어서 우리가 "너 자신을 알라"(소크라테스) 를 화면에 출력하고 싶어서
        // String 을 만든다고 가정해보자
        // 일반적으로 사용하는 "" 를 쓰게 되면? 에러가 발생한다.
        // String str3 = ""너 자신을 알라"(소크라테스)";
        // 위 코드에서는 자바가 아무런 내용이 없는 스트링 값 "" 하나,
        // 너 자신을 알라라는 알 수 없는 명령어 한 토막
        // 그리고 "(소크라테스)" 라는 스트링 값이 나열되어 있기 때문에
        // 에러라고 말하는 것이다.
        // 만약 이렇게 우리가 스트링 안에 "를 문자로써 넣어야 할 때에는 
        // \와 조합하여 넣어야 한다.
        String str3 = "\"너 자신을 알라\"(소크라테스)";
        System.out.println(str3);
        System.out.println();
        
              
        
    }
    
}
