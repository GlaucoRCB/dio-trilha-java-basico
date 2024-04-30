import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 25.0;

        System.out.print("Digite o valor de saque: ");
        Double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado < saldo){

            saldo = saldo - valorSolicitado;
            System.out.println("Tudo certo, aguarde a contagem...");

            System.out.println("novo saldo:" + saldo);

        }

        else{

            System.out.println("Saldo insuficiente para saque.");

        }

        scanner.close();
    }
}
