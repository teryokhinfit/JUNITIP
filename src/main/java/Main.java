import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earning = 0;
        int spending = 0;
        while (true) {
            System.out.println("1.Добавить новый доход");
            System.out.println("2.Добавить новый расход");
            System.out.println("3.Выбрать ситему налогооблажения");
            System.out.println("end. Выход");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите Ваш доход:");
                    String moneyErn = scanner.nextLine();
                    int moneyA = Integer.parseInt(moneyErn);
                    earning += moneyA;
                    break;
                case 2:
                    System.out.println("Введите Ваш расход:");
                    String moneySpen = scanner.nextLine();
                    int moneyB = Integer.parseInt(moneySpen);
                    spending += moneyB;
                    break;
                case 3:
                    int result1 = B.taxEarning(earning);
                    int result2 = B.taxEarningMinusSpending(earning, spending);
                    if (earning < spending) {
                        System.out.println("Доход меньше расхода!");
                    } else if (result1 < result2) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + result1 + " рублей");
                        System.out.println("Налог на другой системе: " + result2 + " рублей");
                        System.out.println("Экономия: " + (result2 - result1) + " рублей");
                    } else if (result1 > result2) {
                        System.out.println("Мы советуем вам УСН доходы минус расходы ");
                        System.out.println("Ваш налог составит: " + result2 + " рублей");
                        System.out.println("Налог на другой системе: " + result1 + " рублей");
                        System.out.println("Экономия: " + (result1 - result2) + " рублей");
                    } else {
                        System.out.println("При любой УСН налог равный");


                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }

        }
    }
}
