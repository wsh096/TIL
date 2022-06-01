import java.util.Scanner;
//암스트롱 수란 각자리수의 세제곱의 합이 같은 값이 되는 수이다.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("숫자를 입력하시오:");
        number = sc.nextInt();
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " 는 암스트롱수다.");
        else
            System.out.println(number + " 는 암스트롱수가 아니다.");
    }
}
