import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int buxCount = input.nextInt();
        int beerAmount = input.nextInt();

        if (buxCount <= 0 || beerAmount <= 0){
            System.out.println("Введены некорректные данные");
            return;
        }

        int totalDrunkBeer = 0;
        for (int i = 0; i < 16; i++){
            totalDrunkBeer += buxCount * beerAmount;
            System.out.println(String.format("К %d неделе будет выпито %d литров жидкости", i+1, totalDrunkBeer));
        }

        if (totalDrunkBeer >= 120) {
            System.out.println("Студент принят в IT-клуб");
        }
        else {
            System.out.println("К сожалению, студент не принят в клуб");
        }
    }
}
