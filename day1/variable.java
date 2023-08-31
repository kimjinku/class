package  day1;
public class variable {
    public static void main(String[] args) {


        //홍길동의 나이를 저장했다가 필요할 때 사용
        //값을 저장하는 상자(그릇) - 변수
        //변수를 만들 때는 크기와 모양 결정해야한다
        // 값 ->숫자(int), 문자(String)
        //홍길동의 나이를 25로 수정하시오
        System.out.println("안녕하세요 저는 23살 홍길동입니다");
        System.out.printf("안녕하세요 저는 %d살 홍길동입니다\n",23);
        System.out.printf("안녕하세요 저는 %d살 홍길동입니다\n",23);
        System.out.printf("안녕하세요 저는 %d살 홍길동입니다\n",23);
        System.out.printf("안녕하세요 저는 %d살 홍길동입니다\n",23);
        // 자료형(타입) 변수명;
        // 오른쪽 값을 왼쪽 변수에 저장

        int age; //그릇을 만들고
        age =25; //그릇에 저장

        int ages = 25; //그릇을 만듦과 동시에 값 저장.

        //변수 사용시 주의할 점.
        //1. 같은 이름으로 두개 이상 변수 만들지 않기
        //2. 숫자나 특수문자로 시작하는 이름은 안됨. 공백도 안됨. 띄어쓰기를 하고싶을땐 대문자나 "_"를 넣는다
        //ex) int aa!!= 10;

    }
}
