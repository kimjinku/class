import java.util.Random;

//
public class Main {
    public static void main(String[] args) {
        //출력
        System.out.println(100);

        System.out.println("안녕하세요\n반갑습니다.");

        System.out.println("100");

        System.out.println(100 + 100);

        System.out.println("100"+"100");

        //문자, 숫자 처럼  값의 유형이 다르면 기능도 다르다.
        //숫자 -> int 문자 -> String
        //문자의 경우 \n을 넣으면 줄이 바뀐다.

        //문자와 숫자를 더하기
        System.out.println(100 + "살" + " 홍길동입니다");

        //문자 포맷을 이용한 출력

        int age = 25;

        System.out.printf("%d년생 %d살 홍길동입니다\n", 93, 29);
        //안녕하세요 저는 23살 홍길동입니다. 5번출력


        System.out.printf("안녕하세요 저는 %d살 홍길동입니다\n",age);
        System.out.printf("안녕하세요 저는 %d살 홍길동입니다\n",age);
        System.out.printf("안녕하세요 저는 %d살 홍길동입니다\n",age);
        System.out.printf("안녕하세요 저는 %d살 홍길동입니다\n",age);
        System.out.printf("안녕하세요 저는 %d살 홍길동입니다\n",age);

        int num= 10;

        System.out.println(num);

        num = 20;

        System.out.println(num);

        int num2 = 50;

        System.out.println(num2);

        num2 = num;

        System.out.println(num2);



    }
}

