import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {

            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("doce do valor: " + valorDoce + "Adicionado no carrinho no carrinho.");
            mesada = mesada - valorDoce;

        }

        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
