import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Map<String, Integer> beverages = Map.of(
                "사이다", 1700,
                "콜라", 1900,
                "식혜", 2500,
                "솔의눈", 3000
        );

        System.out.println("===스파르타 자판기===");
        for(Map.Entry<String, Integer> beverage : beverages.entrySet()) {
            System.out.println(beverage.getKey() + " " + beverage.getValue() + "원");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("구매할 음료를 선택하세요 : ");
        String userChoice = scan.nextLine();

        if(!beverages.containsKey(userChoice)){
            System.out.println("없는 음료입니다. 프로그램 종료합니다.");
            return;
        }

        System.out.print("금액을 입력하세요: ");
        int coin = scan.nextInt();
        int price = beverages.get(userChoice);

        if(coin < price) {
            System.out.println("돈이 부족합니다.");
            return;
        }

        int remain = coin - price;
        System.out.println(userChoice + " 구매 완료");
        System.out.println("잔액: " + remain + "원");

        }
    }

