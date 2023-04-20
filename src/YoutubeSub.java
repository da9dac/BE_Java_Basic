import java.util.Arrays;
import java.util.Scanner;

public class YoutubeSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String id = "admin";
        final String pw = "0000";

        String[] ban = {"킹", "시발", "꺼저", "미친"}; //금칙어
        String[] rep = {"사랑", "희망", "기쁨", "좋다"}; //대체어

        while (true) {
            System.out.println("[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : ");
            String newid = scanner.nextLine();
            System.out.println("[시스템] 유튜브 계정의 비밀번호를 입력하세요{Ex - 0000} : ");
            String newpw = scanner.nextLine();
            if (id.equals(newid) == pw.equals(newpw)) {
                System.out.printf("[안내] 안녕하세요 %s님.\n",id);
                break;
            }
            System.out.println("[경고] 유튜브 계정의 아이디 및 비밀번호를 다시 확인해 주세요.");
        }
        System.out.println("[안내] 유튜브 영상의 자막을 생성해 주세요.");
        System.out.println("생성할 자막을 입력하세요 : ");
        String input = scanner.nextLine();
        System.out.printf("입력하신 자막은 [%s] 입니다.\n",input);
        System.out.println("========================================");
        System.out.println("[알림] 프로그램의 금칙어 리스트입니다.");
        System.out.println(Arrays.toString(ban));
        System.out.println("========================================");
        System.out.println("[알림] 자막 순화 프로그램 결과입니다.");

        for (int i = 0; i < ban.length; i++) {
            while (true) {
                if (input.contains(ban[i])) {
                    input = input.replace(ban[i],rep[i]);
                } else {
                    break;
                }
            }
        }

        System.out.printf(">>> %s\n",input);
        System.out.print("[안내] 프로그램을 종료합니다.");
    }
}
