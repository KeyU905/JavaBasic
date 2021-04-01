package day0401;
// 여러분들이 직접 변수를 만들고 값을 할당해서

// 다음과 같은 형식으로 출력되는 성적표 프로그램을 만드시오

// 번호: 0##번 이름: ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: ###점 평균: 0##.##점
// 5시 48분까지
public class Ex07GradeBook {
    public static void main(String[] args) {

        int a = 1;
        String b = new String("박보검");
        int c = 50;
        int d = 60;
        int e = 70;
        int f = (c + d + e);
        int g = (c + d + e) / 3;

        System.out.println("번호: " + a + "번 이름:" + b);
        
        System.out.printf("번호: " + a);
        System.out.println("번 이름:" + b);

        System.out.print("국어:" + c);
        System.out.print("점 영어:" + d);
        System.out.print("점 수학:" + e);
        System.out.println("점");

        System.out.print("총점: " + f);
        System.out.print("\t평균: " + g);
        System.out.println("점");

        System.out.println("-------------------");

        // 변수의 선언과 할당하는 부분

        // 번호를 담당하는 변수
        int id = 5;

        // 이름을 담당하는 변수
        String name = new String("홍길동");

        // 국어 점수를 담당하는 변수
        int korean = 80;

        // 영어 점수를 담당하는 변수
        int english = 70;

        // 수학 점수를 담당하는 변수
        int math = 91;

        // 총점을 담당하는 변수
        int sum = korean + english + math;

        // 평균 점수를 담당하는 변수
        double average = sum / 3.0;
        // 그냥 3으로 나누면 sum과 3 모두 int이므로
        // 앞에 double 붙여도 int로 값이 나와 소숫점이 생략된다.
        // 따라서 뒤에 .0을 붙여주어야 실수값으로 average 값이 결과로 나온다.

        // 출력하는 부분

        System.out.printf("번호: %03d번 이름: %s\n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점: %3d점 평균: %06.2f점\n", sum, average);
        
    }
}
