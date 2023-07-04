import java.util.Random;

public class Number {

    public static void main(String[] args) {
        Random random = new Random();
        int pcNumber = random.nextInt(100) + 1;
        int gamerNumber = 50;
        while (gamerNumber != pcNumber) {
            if (gamerNumber < pcNumber) {
                System.out.println(gamerNumber + " число меньше того, что загадал компьютер");
                gamerNumber++;
            } else if (gamerNumber > pcNumber) {
                System.out.println(gamerNumber + " число больше того, что загадал компьютер");
                gamerNumber--;
            }
        }
        System.out.println("Вы победили! " + pcNumber);
    }
    
}
