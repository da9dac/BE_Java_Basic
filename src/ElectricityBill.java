import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        /*
        1 기본요금 - 원단위 미만 절사
        2 사용량 요금 - 원단위 미만 절사
        전기요금계 = 원단위 미만 절사한 (기본요금+사용량요금)
        부가가치세 = 전기요금계의 10%
        전력산업기반기금 10원 미만 절사 전기 요금계의 3.7%
        합계
        저압의 경우 : 100이하는 당 60.7원 초과는 125.9원
        200 초과는 187.9 300초과는 280.6 400초과는 417.7
        500초과는 670.6
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("전기를 몇 kWh 사용하셨나요? : ");
        int kwh = scanner.nextInt();

        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;

        if (kwh <= 100) {
            a = kwh * 60.7;
        } else if (kwh > 100 && kwh <= 200) {
            a = 100 * 60.7;
            b = (kwh % 100) * 125.9;
        } else if (kwh > 200 && kwh <= 300) {
            a = 100 * 60.7;
            b = 100 * 125.9;
            c = (kwh % 100) * 187.9;
        } else if (kwh > 300 && kwh <= 400) {
            a = 100 * 60.7;
            b = 100 * 125.9;
            c = 100 * 187.9;
            d = (kwh % 100) * 280.6;
        } else if (kwh > 400 && kwh <= 500) {
            a = 100 * 60.7;
            b = 100 * 125.9;
            c = 100 * 187.9;
            d = 100 * 280.6;
            e = (kwh % 100) * 417.7;
        } else {
            a = 100 * 60.7;
            b = 100 * 125.9;
            c = 100 * 187.9;
            d = 100 * 280.6;
            e = 100 * 417.7;
            f = (kwh % 100) * 670.6;
        }
        double charge = a+b+c+d+e+f;;

        System.out.printf("%dkWh의 전기 요금은 %.2f원 입니다",kwh,charge);
    }
}
