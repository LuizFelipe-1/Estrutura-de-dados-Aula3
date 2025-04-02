import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o salário mínimo: ");
        double sm = scanner.nextDouble();
        
        System.out.print("Entre com a quantidade em quilowatts: ");
        double qtdade = scanner.nextDouble();
        double preco = sm / 700; 
        double vp = preco * qtdade;   
        double vd = vp * 0.9;         

        System.out.printf("\nPreço do quilowatt: "+ preco);
        System.out.printf("\nValor a ser pago: "+ vp);
        System.out.printf("\nValor com desconto: " +  vd);

        scanner.close();
    }
}