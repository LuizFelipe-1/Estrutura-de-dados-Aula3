import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o logaritmando: ");
        double num = scanner.nextDouble();
        

        if (num <= 0) {
            System.out.println("O logaritmo não está definido para números menores ou iguais a zero.");
        } else {

            double logaritmo = Math.log10(num);
            

            System.out.println("Logaritmo: " + logaritmo);
        }

        scanner.close();
    }
}
