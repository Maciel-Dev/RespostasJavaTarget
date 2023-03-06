import java.io.Console;
import java.util.Scanner;

public class Main extends Fibonnacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número ou Digite 0 para Sair: ");
        int num = sc.nextInt();

        while(num != 0)
        {
            if(calculo(num) == 1){
                System.out.println("O número " + num + " faz parte da sequência de Fibonacci");
            }
            else
            {
                System.out.println("O número " + num + " não faz parte da sequência de Fibonacci");
            }
            System.out.println("Digite o número ou Digite 0 para Sair: ");
            num = sc.nextInt();
        }

    }
}