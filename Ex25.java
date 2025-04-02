import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma data do seguinte modelo (ddmmaa): ");
        int data = scanner.nextInt();
        int dia = data / 10000;
        int mes = (data % 10000) /100;
        int ano = data % 100;
        
        System.out.println("Dia: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Ano: " + ano);

        scanner.close();
    }
}
