import java.util.Random;
import java.util.Scanner;

public class Gun {

    public static void main(String[] args) {
        double playerMoney = 100;

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int scan;
        int rand = random.nextInt(7);
        boolean win = false;

        System.out.println("Добро пожаловать в русскую рулетку! чтоб начать напишите 1");


        while (playerMoney > 0){
            //ставка
            System.out.println("у тебя на счету $" + playerMoney +"Сколько вы хотите поставить?");

            double playerBet = sc.nextDouble();
            if(playerBet > playerMoney){
                System.out.println("У вас столько нет!");
                break;
            }
            boolean endRound = false;
            if(playerBet < 10) {
                System.out.println("Маленькая сумма! с вами не захотели играть :(");
                break;
            }

        for (int i = 0; i < 7; i++) {

            if (i == 1) System.out.println("писталет заряжен одной пулей, 6 попыток. Вы готовы выстрелить? 1- да/ 0 - нет");
            scan = sc.nextInt();
            if (scan == 1) {
                win = false;
            } else if (scan == 0) {
                System.out.println("Вы трус! но остались живы");
                break;
            }

            if (i != rand) {
                System.out.println("Вы живы! поздравляю");
            } else if (i == rand) {
                System.out.println("Ваши мозги на столе, вы продержались: " + (i - 1) + " попытки поздравляю!");
                playerMoney -= playerBet;
                System.out.println("повторим игру в другой жизни? 1- да/ 0- нет");

                win = true;
                scan = sc.nextInt();

                if (scan == 1) {
                    i = 0;
                    win = false;
                    rand = random.nextInt(6);

                } else if (scan == 0) {
                    System.out.println("Вы трус! но остались живы");
                    break;
                }
            }
            if (i == 6) {
                System.out.println("вы везунчик, произошла осечка. Сейчас перезарядим");
                System.out.println("повторим игру в другой жизни? 1- да/ 0- нет");
                win = true;
                scan = sc.nextInt();

                if (scan == 1) {
                    i = 0;
                    win = false;
                    rand = random.nextInt(6);

                } else if (scan == 0) {
                    System.out.println("Вы трус! но остались живы");

                    break;
                }

            }
        }
    }
}