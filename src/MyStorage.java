import java.util.Scanner;

public class MyStorage {
    static String[] product = new String[5];
    static int[] product_num = new int[5];

    static void showMenu(){
        // 사용자를 위해 해당 기능들 앞에 번호를 넣어 알아보기 쉽도록 합니다.
        //TODO:
        System.out.println("1. 물건 정보(제품명) 등록하기");
        System.out.println("2. 물건 정보(제품명) 등록 취소하기");
        System.out.println("3. 물건 넣기 (제품 입고)");
        System.out.println("4. 물건 빼기 (제품 출고)");
        System.out.println("5. 재고 조회");
        System.out.println("6. 프로그램 종료");
        System.out.println("-".repeat(30));
    }

     //selectMenu() 메서드는 사용자가 프로그램의 기능을 선택할 수 있도록 합니다.
     //인자는 입력을 받기 위한 Scanner 클래스의 객체(s) 를 전달받습니다.
    static int selectMenu(Scanner s){
        // 해당 메서드가 호출되면 프로그램의 기능을 호출할 수 있도록 안내 메시지를 출력합니다.
        //TODO:
        // 프로그램의 기능은 번호(정수)로 전달받습니다.
        // 해당 프로그램은 사용자가 선택한 번호(select)를 반환하도록 합니다.
        System.out.print("[System] 원하는 기능의 번호를 입력하세요 : ");
        int select = s.nextInt();
        return select;
    }
    //1. 물건 정보(제품명) 등록하기 (구현완료)
    static String product_add(Scanner s) {
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals("null")) {
                System.out.print("[System] 제품 등록을 원하는 제품명을 입력하세요 : ");
                product[i] = s.next();
                System.out.println("[System]등록이 완료됬습니다.");
                break;
            }
        }
        System.out.println("[System] 현재 등록된 제품 목록 ▼");
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals("null")) {
                System.out.println("> 등록 가능");
            } else {
                System.out.printf("> %s\n", product[i]);
            }
        }
        return "-".repeat(30);
    }
    //2. 물건 정보(제품명) 등록 취소하기 (구현완료)
    static String product_del(Scanner s) {
        System.out.print("[System] 제품 등록 취소를 원하는 제품명을 입력하세요 : ");
        String del_pro = s.next();
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals(del_pro)) {
                product[i] = "null";
                System.out.println("[System] 제품 취소가 완료됬습니다.");
                break;
            }
            if ( i == (product.length-1)) {
                System.out.println("[System] 등록되지 않은 제품입니다.");
                return "-".repeat(30);
            }
        }
        return "-".repeat(30);
    }
//    3. 물건 넣기 (제품 입고) (구현완료)
    static String product_plus(Scanner s) {
        System.out.println("[System] 물건의 수량을 추가합니다.(입고)");
        product_num_list();
        System.out.println("[System] 수량을 추가할 제품명을 입력하세요 : ");
        String del_pro = s.next();
        System.out.print("[System] 추가할 수량을 입력해주세요 : ");
        int num_pro = s.nextInt();
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals(del_pro)) {
                product_num[i] += num_pro;
                System.out.println("[Clear] 정상적으로 제품의 수량 추가가 완료되었습니다.");
                product_num_list();
                break;
            }
            if ( i == (product.length-1)) {
                System.out.println("[System] 등록되지 않은 제품입니다.");
                return "-".repeat(30);
            }
        }
        return "-".repeat(30);
    }
//    4. 물건 빼기 (제품 출고)
    static String product_minus(Scanner s) {
        System.out.println("[System] 제품의 출고를 진행합니다.");
        product_num_list();
        System.out.print("[System] 출고를 진행할 제품명을 입력하세요 : ");
        String del_pro = s.next();
        System.out.print("[System] 원하는 출고량을 입력하세요 : ");
        int num_pro = s.nextInt();
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals(del_pro)) {
                product_num[i] -= num_pro;
                System.out.println("[Clear] 출고가 완료되었습니다.");
                product_num_list();
                break;
            }
            if ( i == (product.length-1)) {
                System.out.println("[System] 등록되지 않은 제품입니다.");
                return "-".repeat(30);
            }
        }
        return "-".repeat(30);
    }
//    5. 재고 조회
    static void product_num_list() {
        System.out.println("[System] 현재 등록된 제품 및 수량 ▼");
        for (int i = 0; i < product_num.length; i++) {
            if (product[i] == "null") {
                System.out.printf("> 등록 가능 : %d개\n", product_num[i]);
            } else {
                System.out.printf("> %s : %d개\n", product[i], product_num[i]);
            }
        }
    }


    // main() 메서드는 점장님의 이름을 인자(args)로 전달 받습니다.
    public static void main(String[] args){
        // 해당 프로그램의 버전, 점장님의 이름, 프로그램의 기능을 출력합니다.
        //TODO:
        System.out.println("[Item_Storage_V3]");
        System.out.println("-".repeat(30));
        System.out.println("[System] 코드스테이츠 점장님 어서오세요.");
        System.out.println("[System] 해당 프로그램의 기능입니다.");
        showMenu();
        // 위에서 정의한 메서드들을 알맞게 배치하여 줍니다.
        // 사용자의 기능 입력을 받기 위한 Scanner() 메서드를 사용합니다.
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < product.length; i++) {
            product[i] = "null";
        }

        while (true) {
            int remote = selectMenu(s);
            switch (remote) {
                case 1: {
                    System.out.println(product_add(s));
                    showMenu();
                    break;
                }
                case 2: {
                    System.out.println(product_del(s));
                    showMenu();
                    break;
                }
                case 3: {
                    System.out.println(product_plus(s));
                    showMenu();
                    break;
                }
                case 4: {
                    System.out.println(product_minus(s));
                    showMenu();
                    break;
                }
                case 5: {
                    product_num_list();
                    System.out.println("-".repeat(30));
                    showMenu();
                    break;
                }
                case 6: break;
                default:
                    System.out.println("메뉴를 다시 선택해주세요.");
                    break;
            }
            //6. 프로그램 종료 (구현완료)
            if (remote == 6) {
                System.out.println("[System] 프로그램을 종료합니다.");
                System.out.println("[System] 감사합니다.");
                break;
            }
        }

        // 프로그래밍 요청사항 6번을 확인해 보세요.
        // 사용자가 특정 번호를 입력하기 전 까지 프로그램은 종료되지 않도록 합니다.

        // 사용자의 입력에 따라 프로그램의 기능들이 실행될 수 있도록 합니다.
        // switch() 를 사용하여 줍니다.

    }
}
