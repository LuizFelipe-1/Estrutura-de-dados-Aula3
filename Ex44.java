import java.util.Scanner;

public class Ex44{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita o logaritmando
        System.out.print("Entre com o logaritmando: ");
        double num = scanner.nextDouble();
        
        System.out.print("Entre com a base: ");
        double base = scanner.nextDouble();
        
        if (num <= 0 || base <= 0 || base == 1) {
            System.out.println("O logaritmo não está definido para números menores ou iguais a zero e a base não pode ser 1.");
        } else {
            double logaritmo = Math.log(num) / Math.log(base);
            System.out.printf("O logaritmo de %.2f na base %.2f é: %.4f\n", num, base, logaritmo);
        }
        scanner.close();
    }
}