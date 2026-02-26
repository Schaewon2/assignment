import java.util.Random;

public class RandomNickname {
    private String[] firstList = {"기절초풍", "멋있는", "재미있는"};
    private String[] secondList = {"도전적인", "노란색의", "바보같은"};
    private String[] thirdList = {"돌고래", "개발자", "오랑우탄"};

    public String createRandomNickname() {
        Random random = new Random();

        String first = firstList[random.nextInt(firstList.length)];
        String second = secondList[random.nextInt(secondList.length)];
        String third = thirdList[random.nextInt(thirdList.length)];

        return String.format("%s %s %s", first, second, third);
    }

    public static void main(String[] args) {
        RandomNickname randomNickname = new RandomNickname();
        String myNickname = randomNickname.createRandomNickname();
        System.out.println(myNickname);
    }
}
