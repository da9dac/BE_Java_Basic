public class Test {
    public static void main(String[] args) {
        String text = "가나 다라 마바 사아 자차 가파";
        String[] ban = {"가","다","마","사"};
        String[] rep = {"나","라","바","아"};
        //기대 결과값 나나 라라 바바 아아 나차

        for (int i = 0; i < ban.length; i++) {
            while (true) {
                if (text.contains(ban[i])) {
                    text = text.replace(ban[i],rep[i]);
                } else {
                    break;
                }
            }
        }

        System.out.print(text);
    }
}
