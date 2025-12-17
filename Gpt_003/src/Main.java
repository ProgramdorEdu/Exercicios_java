import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n1 = 0;
            int n2 = 0;

            System.out.println("Digite um numero inteiro");
            n1 = scanner.nextInt();

            System.out.println("Digite outro número inteiro: ");
            n2 = scanner.nextInt();

            System.out.println("------Operações basicas------");
            System.out.printf("\nSoma: %d + %d = %d", n1,n2, n1+n2);
            System.out.printf("\nSubtração : %d - %d = %d", n1, n2, n1-n2);
            System.out.printf("\nMultiplicação : %d x %d = %d", n1, n2, n1*n2);
            if (n2 == 0){
                System.out.println("Divisão por 0 impossível");
            }else {
                System.out.printf("\nDivisao: %d / %d = %.2f", n1, n2, (double) n1 / n2);
            }
            System.out.println("\n***************Verificando se o numero é ímpar ou par**************");
            System.out.println("\nDigite um numero: ");
            int n3 = scanner.nextInt();

            if(n3%2 == 0) {
                System.out.println("Seu numero é par!!");
            }else{
                System.out.println("Seu número é ímpar!!");
            }

            System.out.println("\n\n*********Comparador de números 5000!!!!!*********");
            System.out.println("\nDigte um numero inteiro primeiro: ");
            int n4 = scanner.nextInt();

            System.out.println("\nOtimo agora digite outro número inteiro: ");
            int n5 = scanner.nextInt();

            if(n4 > n5){
                System.out.println("O número maior é " + n4);
            } else if (n4 == n5) {
                System.out.println("Eles são iguais");
            } else{
                System.out.println("O número maior é " + n5);
            }

            scanner.close();

    }
}