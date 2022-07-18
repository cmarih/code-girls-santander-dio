package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o valor de A: ");
            a = scan.nextInt();
        System.out.println("Digite o valor de B: ");
            b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int dividir = dividir(a, b);
        int mutiplicar = mutiplicar(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Subtração: " + subtrair);
        System.out.println("Divisão: " + dividir);
        System.out.println("Multiplicação: " + mutiplicar);

    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair( int a, int b) {
        return  a - b;
    }

    public static int mutiplicar(int a, int b){
        return  a * b;
    }

    public static int dividir(int a, int b){
        return  a / b;
    }
}
