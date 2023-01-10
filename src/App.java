import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número, para gerar sua tabela de multiplicação: ");

        int number = input.nextInt();
        
        System.out.println("Tabela de multiplicação de " + number);

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number*i);
        }

        input.close();
    }
}
