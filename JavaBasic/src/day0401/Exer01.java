package day0401;

public class Exer01 {
    public static void main(String[] args) {
        
        int id = 17;
        String name = new String("박보검");
        int kor = 92;
        int eng = 91;
        int math = 94;
        int sum = kor + eng + math;
        double avr = sum / 3.0;
        
        System.out.printf("번호: %03d번 이름: %s\n" , id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", kor, eng, math);
        System.out.printf("총점: %3d점 평균: %06.2f점\n", sum, avr);
        
        
        System.out.println("-------- 정 답 ----------");
        
        System.out.printf("번호: %03d번 이름: %s\n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", kor, eng, math);
        System.out.printf("총점: %3d점 평균: %06.2f점\n", sum, avr);
        
        
        
        
        
        
        
    }
}
