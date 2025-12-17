import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Media media = new Media();
        Scanner scanner = new Scanner(System.in);
        byte n1 = Byte.MAX_VALUE;
        short n2 = Short.MAX_VALUE;
        int n3 = Integer.MAX_VALUE;
        long n4 = Long.MAX_VALUE;
        char n5 = Character.MAX_VALUE;
        float n6 = Float.MAX_VALUE;
        double n7 = Double.MAX_VALUE;
        boolean sOuN = Boolean.TRUE;

        System.out.printf("Byte maximo = %d\nShort maximo: %d\nInt maximo: %d\nLong maximo = %d\nChar maximo: %c\nFloat maximo: %f\nDouble ,maximo = %f\nIsso é um boolean : %b",n1,n2,n3,n4,n5,n6,n7,sOuN);
        System.out.println("\nDigite um numero inteiro: ");
        int n8 = Integer.parseInt(scanner.nextLine());

        System.out.printf("\nSeu int digitado foi %d, se convertido em double ficaria %.4f",n8,(double) n8);

        System.out.println("\nDigitae um numero decimal: ");
        double n9 = Double.parseDouble(scanner.nextLine());

        System.out.printf("\nSeu número digitado foi %f, em inteiro ficaria %d",n9,(int) n9);

        System.out.println("\nInsira a nota 1 do aluno :");
        double n10 = Double.parseDouble(scanner.nextLine());

        System.out.println("Insira a nota 2 do aluno: ");
        double n11 = Double.parseDouble(scanner.nextLine());

        media.calculaMedia(n10,n11);


    }


}