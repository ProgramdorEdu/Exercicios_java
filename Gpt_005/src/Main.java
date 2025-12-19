import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        int j = 100;
        long k = 0;
        for (int l = 0; l <= j; l++){
            System.out.println(k +=l);
        }
        System.out.println(k);

        //Jeito mais rapido mas visto na internet e não descoberto por mim

        long somaRapida = (j * (j + 1)) / 2;
        System.out.println(somaRapida);

        for(int numero = 1; numero <=10; numero ++){
            System.out.println();
            for (int multiplicador = 1; multiplicador <=10; multiplicador++){
                System.out.printf("%d * %d = %d\n",numero, multiplicador, numero * multiplicador);
            }
        }


        int[] listaNumero = new int [10];
        for(int p = 0; p < listaNumero.length; p++){
            System.out.println("Digite um numero: ");
            listaNumero[p]= scanner.nextInt();
        }
        int maiorNumero = listaNumero[0];
        for (int q = 0; q < listaNumero.length; q++){
            if (listaNumero[q] > maiorNumero){
            maiorNumero = listaNumero[q];
            }
        }
        System.out.println("O maior numero é : " + maiorNumero);
    }
}