import java.util.Scanner;

public class Ex23 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de três casas: ");
        int a = scanner.nextInt();

         int d = (a % 100) / 10;
        
        System.out.println("Algarismo na casa da dezena e o: "+d);

        scanner.close();
    }
}
