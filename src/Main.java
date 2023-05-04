import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a hora no formato HH:MM : \n");
        double hora = leitura.nextDouble();

        int horas = (int) hora; //casting: converter um de um tipo para outro. Nesse caso, double para int.
        int minutos = (int) ((hora - horas) * 100 + 1);

        int totalEmMinutos = horas * 60 + minutos;

        System.out.println(minutos);
        System.out.println(totalEmMinutos);

        leitura.close();
    }
}