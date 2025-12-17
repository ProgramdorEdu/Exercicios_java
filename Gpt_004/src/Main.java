import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int idade;
        double media;
        Scanner scanner = new Scanner(System.in);
        int switchCase;
        
        System.out.println("Qual sua idade? ");
        idade = scanner.nextInt();
        scanner.nextLine();

        if (idade < 18){
            System.out.println("Você ainda é de menor");
        } else if (idade >= 18 && idade <65) {
            System.out.println("Você é um adulto");
        }else{
            System.out.println("Você é um idoso");
        }

        System.out.println("\nQual foi sua media final na materia?");
        media = scanner.nextDouble();

        if(media > 6){
            System.out.println("Aprovado");
            switchCase = 1;
        } else if (media < 2 && media >0) {
            System.out.println("Reprovado");
            switchCase = 2;
        }else{
            System.out.println("Recuperação");
            switchCase = 3;
        }

        System.out.println("\nAgora com Switch");
        switch (switchCase){
            case 1 :
                System.out.println("Aprovado");
                break;
            case 2:
                System.out.println("Reprovado");
                break;
            case 3:
                System.out.println("Recuperação");
                break;
            default:
                System.out.println("Invalido");
        }


        scanner.close();
    }
}