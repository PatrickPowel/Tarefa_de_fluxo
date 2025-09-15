import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // cria o Scanner
        Scanner entrada = new Scanner(System.in);
        //Recebe a primeira nota
        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        //Recebe a segunda nota
        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        //Recebe a terceira nota
        System.out.println("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();
        //Recebe a quarta nota
        System.out.println("Digite a quata nota: ");
        double nota4 = entrada.nextDouble();
        // formula para calcular as 4 notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Media %.2f%n", media);
        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media >= 5 && media < 7){
            System.out.println("Recuperacao");
        }else {
            System.out.println("Reprovado");
        }entrada.close();
    }
}