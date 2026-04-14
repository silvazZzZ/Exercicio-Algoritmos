import java.util.Scanner;

public class Main {

    // função para calcular média
    public static double media(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String[] nomes = new String[5];
        double[] n1 = new double[5];
        double[] n2 = new double[5];
        double[] n3 = new double[5];
        double[] medias = new double[5];

        int qtd;

        System.out.print("Quantos alunos deseja cadastrar? (max 5): ");
        qtd = sc.nextInt();
        sc.nextLine();

        // entrada
        for (int i = 0; i < qtd; i++) {
            System.out.println("\nAluno " + (i + 1));

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Nota 1: ");
            n1[i] = sc.nextDouble();

            System.out.print("Nota 2: ");
            n2[i] = sc.nextDouble();

            System.out.print("Nota 3: ");
            n3[i] = sc.nextDouble();
            sc.nextLine();

            medias[i] = media(n1[i], n2[i], n3[i]);
        }

        // maior média
        double maior = medias[0];
        int pos = 0;

        for (int i = 1; i < qtd; i++) {
            if (medias[i] > maior) {
                maior = medias[i];
                pos = i;
            }
        }

        // saída (tabela)
        System.out.println("\n--- RESULTADO ---");

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nNome: " + nomes[i]);
            System.out.println("Notas: " + n1[i] + ", " + n2[i] + ", " + n3[i]);
            System.out.println("Média: " + medias[i]);

            if (medias[i] >= 7) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }

        System.out.println("\nMaior média: " + nomes[pos] + " (" + maior + ")");

        sc.close();
    }
}