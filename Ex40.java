import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        int quoc, rest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o dividendo:");
        int val1 = scanner.nextInt();

        System.out.println("Digite o divisor:");
        int val2 = scanner.nextInt();
        
        quoc = val1 / val2;
        rest = val1 % val2;

        System.out.println("dividendo: "+ val1);
        System.out.println("divisor: "+ val2);
        System.out.println("quociente: " + quoc);
        System.out.println("resto: " + rest);

        scanner.close();
    }
}
