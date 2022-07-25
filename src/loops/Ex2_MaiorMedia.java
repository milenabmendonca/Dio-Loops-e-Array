package loops;

import java.util.Scanner;

public class Ex2_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int numero;
        int count =0;
        int maiorn = 0;
        int soma = 0;


        do {
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maiorn) maiorn = numero;

            count = count +1;

        } while (count <5);

        System.out.println("Maior numero:" + maiorn);
        System.out.println("Media:" + (soma/5));

    }
}
