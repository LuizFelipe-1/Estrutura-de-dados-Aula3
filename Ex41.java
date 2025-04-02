import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
    double mediaP;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro numero:");
    double val1 = scanner.nextDouble();

    System.out.println("Digite o segundo numero:");
    double val2 = scanner.nextDouble();

    System.out.println("Digite o terceiro numero:");
    double val3 = scanner.nextDouble();

    System.out.println("Digite o quarto numero:");
    double val4 = scanner.nextDouble();

    mediaP = (val1 * 1 + val2 * 2 + val3 * 3 + val4 * 4) / 10;
    System.out.println("A media ponderada e: " + mediaP);

    scanner.close();
    }
}
