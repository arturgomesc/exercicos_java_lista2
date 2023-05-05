import java.util.Arrays;
import java.util.Scanner;

public class quatroValores {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Escolha: ");
        int valorI = leitura.nextInt();

        System.out.println("Digite o valor de A: ");
        double valorA = leitura.nextInt();

        System.out.println("Digite o valor de B: ");
        double valorB = leitura.nextInt();

        System.out.println("Digite o valor de C: ");
        double valorC = leitura.nextInt();

        double[] array = {valorA, valorB, valorC};
        Arrays.sort(array);

        if (valorI == 1) {
            System.out.println(Arrays.toString(array));
        } else if (valorI == 2) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        double temp = array[i]; array[i] = array[j]; array[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        } else if (valorI == 3) {
            int indiceMaior = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[indiceMaior]) {
                    indiceMaior = i;
                }
            }
            int aux = (int) array[indiceMaior];
            array[indiceMaior] = array[1];
            array[1] = aux;
        }
        System.out.println(Arrays.toString(array));
    }
}