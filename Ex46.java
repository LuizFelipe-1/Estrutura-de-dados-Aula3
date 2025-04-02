import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();
        double nsaldo = saldo * 1.01;
        
        System.out.printf("Novo saldo: " +nsaldo);
        
        scanner.close();
    }
}