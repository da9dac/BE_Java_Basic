import java.util.Scanner;

public class Ai_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("==============================");
        System.out.print("[System] a 값을 입력하여 주세요 : ");
        int a = scanner.nextInt();
        System.out.print("[System] b 값을 입력하여 주세요 : ");
        int b = scanner.nextInt();
        System.out.println("==============================");

        double[] x = new double[4];
        double y = 0;

        for (int i = 0; i < x.length; i++) {
            System.out.println("광고비를 입력하세요 : ");
            x[i] = scanner.nextDouble();
        }

        System.out.println("[안내] 입력된 '광고비'는 다음과 같습니다.");
        for(int i = 1; i <= x.length; i++) {
            System.out.printf("%d 번째) %.1f원  ", i, x[i-1]);
        }

        System.out.println("[안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다.");

        // 반복문을 활용해 다수의 광고비(x_list)를 호출하여 방문자 수 예측값을 연산합니다.
        for (int i = 1; i <= 4; i++) {
            y = a * x[i-1] + b;
            System.out.printf("%d 번째 예측) %.1f회 방문\n", i, y);
        }
    }
}
