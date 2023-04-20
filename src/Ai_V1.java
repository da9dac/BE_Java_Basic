import java.sql.SQLOutput;
import java.util.Scanner;

public class Ai_V1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[인공지능 프로그램] V1");
        System.out.println("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
        int x = scanner.nextInt();
        System.out.printf("입력된 광고비는 %d 원 입니다.\n",x);

        int a = 2;
        int b = 1;

        int y = a * x + b;

        System.out.printf("[안내] AI의 예측(클릭 수)은  %d회 입니다.\n",y);
    }
}
