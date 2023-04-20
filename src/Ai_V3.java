import java.util.Scanner;

public class Ai_V3 {
    public static void main(String[] args) {
        double[][] xy_lists = new double[4][2];
        double diff = 0; //편차
        double diff_pow = 0; //편차제곱
        double sum_diff_pow = 0; //편차 제곱 합

        Scanner scanner = new Scanner(System.in);

        System.out.println("[인공지능 프로그램 V3]");
        System.out.println("==============================");

        System.out.println("[안내] 인공지능 프로그램에 할당된 데이터");

        for (int i = 0; i < xy_lists.length; i++) {
            System.out.print("[실제값] 웹 페이지 방문자 수 : ");
            xy_lists[i][0] = scanner.nextDouble();
            System.out.print("[예측값] 웹 페이지 방문자 수 : ");
            xy_lists[i][1] = scanner.nextDouble();
        }

        for (int i = 0; i < xy_lists.length; i++) {
            System.out.printf("%d번 째 데이터) [실제값] 웹 페이지 방문자 수 : %.1f  [인공지능 예측값] 웹 페이지 방문자 수 : %.1f\n", i+1, xy_lists[i][0], xy_lists[i][1]);
        }

        for (int i = 0; i < xy_lists.length; i++) {
            diff = xy_lists[i][0] - xy_lists[i][1];
            diff_pow = diff*diff;
            sum_diff_pow += diff_pow;
            System.out.printf("[%d 번째 데이터] 실제 값과 예측값의 오차 : %.1f\n", i+1, diff);
            System.out.printf("[안내] 오차의 제곱 : %.1f\n", diff_pow);
        }

        System.out.println("==============================");
        System.out.printf("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) : %.1f",sum_diff_pow);
    }
}
