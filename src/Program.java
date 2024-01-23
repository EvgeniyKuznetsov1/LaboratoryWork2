import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите границу (n): ");
        double nEnd = input.nextDouble();
        System.out.print("Введите x: ");
        double x = input.nextDouble();

        double result = 0;

        if (Math.abs(x) < 1){
            for(int n = 0; n <= nEnd; n++) {
                result += Math.pow(x, (2 * n + 1)) / (2 * n + 1);
            }
            System.out.printf("Arth x = %f", result);
        }
        else {
            System.out.println("Не удовлетворяет |x| < 1");
        }
    }
}
