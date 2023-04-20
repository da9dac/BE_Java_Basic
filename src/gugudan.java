import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");
        int num = scanner.nextInt();

        int start = 1;
        int end = 9;

        System.out.printf("%d 단이 입력되었습니다.\n",num);

        if (num < 2 || num > 9) {
            System.out.println("[경고] 구구단은 2단 ~ 9단 까지만 선택할 수 있습니다");
            System.out.print("프로그램을 종료합니다");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.printf("%d * %d = %d\n", num, i, num*i);
            }
        }
    }
}
