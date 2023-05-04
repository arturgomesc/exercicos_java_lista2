import java.util.Scanner;
public class salarioMinimo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o salário mínimo: ");
        double salario = leitura.nextDouble();

        System.out.println("Diga suas horas trabalhadas: ");
        int horas = leitura.nextInt();

        double imposto = (3 * salario)/100;

        System.out.println("Seu salário a receber: R$" + ((salario/2 * horas) - imposto));
    }
}
