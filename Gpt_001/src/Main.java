//1️⃣ Estrutura básica
//
//Crie um programa que imprima seu nome, idade e cidade.
//
//Explique (em comentário) a função do método main.
//
//Modifique o programa para receber os dados pelo Scanner.

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome = "Eduardo";
        String cidade = "Rio de Janeiro";
        byte idade = 30;

        System.out.printf("Olá meu nome é %s, moro em %s e tenho %d anos", nome, cidade, idade);

//        A funçao do metodo main é agrupar as classes criadas de modo a executalas em suas funçoes

        System.out.println("\nAgora me diga seu nome: ");
        nome = scanner.nextLine();

        System.out.println("\nAgora me diga em que cidade você vive: ");
        cidade = scanner.nextLine();

        System.out.println("\nPor ultimo me diga sua idade: ");
        idade = scanner.nextByte();

        System.out.printf("Muito prazer %s, seja bem vindo ao programa de estagios, bom saber que você mora em %s e com sua idade de %d tera muitos anos para trabalhar com a gente", nome, cidade, idade);

        scanner.close();
    }
}