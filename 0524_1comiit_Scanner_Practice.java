//왕석현 Scanner220524_연습

import java.util.Scanner;

public class Practice0524 {

    public static void main(String[] args){
        String name;
        int age;
        double height;
        String intro;
        String buffer;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        name = sc.next();
        System.out.print("나이를 입력하세요: ");
        age = sc.nextInt();
        System.out.print("키를 입력하세요: ");
        height = sc.nextInt();
        System.out.print("자기소개를 입력하세요: ");
        buffer = sc.nextLine();//개행문자도 하나의 Line으로 인식 그러니까 문자열이 바뀌는 사이의 간격이라고 하면 되려나? 어쨋든 한 번 더 해줘야 됨. 그냥 외워!
        intro = sc.nextLine();

        System.out.printf("이름은 %s 나이는 %02d, 키는 %.0f입니다.\n", name, age, height,intro);
        System.out.println(intro);
    }
}
