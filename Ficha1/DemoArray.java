package Ficha1;

import java.util.Scanner;

public class DemoArray {
    public static int[] array = new int[5];
    static Scanner input = new Scanner(System.in);

    public static void criarArray() {

        array[0] = 15;
        array[1] = 79;
        array[2] = 2;
        array[3] = 23;
        array[4] = 1;


    }

    public static void limparArray() {
        for (int i = 0;  i < array.length; i++) {
            array[i]=0;
            System.out.println(array[i]);
        }

    }
    public static void procurarElemento(){
        int numero;
        System.out.println("Insira a posição do número a procurar: ");
        numero = input.nextInt();
        boolean bool = false;

        for (int i= 0; i < array.length; i++) {
            if(array[i]==numero) {
                bool =true;
                System.out.println("O número está na posição " +i);
            }
        }
        if(bool==false) {
            System.out.println("O número não foi encontrado.");
        }
    }
    public static void procurarNumero(){
        int numero;
        System.out.println("Insira o número que quer procurar: ");
        numero=input.nextInt();
        boolean bool=false;

        for (int i=0; i< array.length; i++) {
            if (array[i] == numero) {
                bool = true;
                System.out.println("O número " + numero + " existe e está na posição: " + i);
            }
        }
        if(bool==false) {
                System.out.println("O número " + numero + " não existe.");
        }
    }
    public static void ordenarArray(){
        int menor =0;
        for(int i=0; i<array.length;i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[i] ) {
                    menor=array[i];
                    array[i]=array[j];
                    array[j]=menor;
                }
            }
        }
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void pesquisaBinaria(){

        int menor =0;
        for(int i=0; i<array.length;i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[i] ) {
                    menor=array[i];
                    array[i]=array[j];
                    array[j]=menor;
                }
            }
        }
        int metade=array.length/2;
        int numero;
        int first = 0;
        int last = array.length -1;
        System.out.println("Insira o número que quer procurar: ");
        numero= input.nextInt();

        while(first <= array.length) {
            if (array[metade] < numero) {
                first = metade + 1;
            } else if (array[metade] == numero) {
                System.out.println("Número " + numero + " encontrado na posição " + metade);
                break;
            } else {
                last = metade - 1;
            }metade=(first + last)/2;
        }
        if (first> last) {
            System.out.println("Número não encontrado.");
        }

    }
}