import java.util.Scanner;
public class salarioReajuste {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o ano atual para calcular seu salário este ano: \n");
        int anoAtual = leitura.nextInt();

        double salarioInicial = 1000.00;
        double percentual = 1.5/100;
        double salarioAtual = salarioInicial*(1+percentual);
        for (int ano = 2019; ano <= anoAtual; ano++) {
            percentual = 2*percentual;
            salarioAtual = salarioAtual*(1+percentual);
        }
        System.out.printf("Salário atual do funcionário é R$%.2f", salarioAtual);
    }
}