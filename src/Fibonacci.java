import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1단계. 프로그램 시작을 알리는 출력문 선언
        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        System.out.print("원하는 수열의 개수를 입력해 주세요 : ");
        int num = scanner.nextInt();
        // 2단계. 피보나치 수열의 점화식 코드 작성
        int num1 = 1;
        int num2 = 1;
        int[] fibonacci = new int[num];

        fibonacci[0] = num1;
        fibonacci[1] = num2;
        // 반복문을 통한 피보나치 수열 점화식 작성
        for (int i = 2; i < num; i++) {
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }
        // 피보나치 수열의 n+2번 째 값은 (n + n+1)를 통해 구할 수 있습니다.

        // 3단계.
        // 결과 출력을 위한 안내 문구 출력 입니다.
        System.out.println("[피보나치 수열 출력]");
        for (int result : fibonacci) {
            System.out.println(result);
        }
        System.out.println("[안내]프로그램을 종료합니다.");
        // 피보나치 수열은 fibonacci 배열에 들어가 있기에 이를 반복문을 통해 호출
    }
}
