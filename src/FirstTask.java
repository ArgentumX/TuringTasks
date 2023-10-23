import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int N = input.nextInt();

        int i = 0;
        do {
            System.out.println(s);
            N -= 1;
        } while (N > 0);
    }
}