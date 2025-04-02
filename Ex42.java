import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ângulo em graus: ");
        double angulo = scanner.nextDouble();
        
        double rang = (angulo * 3.14) / 180;
        
        System.out.println("Seno: " + Math.sin(rang));
        System.out.println("Cosseno: " + Math.cos(rang));
        System.out.println("Tangente: " + Math.tan(rang));
        
        double secante = 1 / Math.cos(rang);
        double cosecante = 1 / Math.sin(rang);
        double cotangente = 1 / Math.tan(rang);
        
        System.out.println("Co-secante: " + cosecante);
        System.out.println("Secante: " + secante);
        System.out.println("Co-tangente: " + cotangente);
        
        scanner.close();
    }
}