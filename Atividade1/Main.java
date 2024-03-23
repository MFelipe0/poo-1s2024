package Atividade1;

public class Main {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        calc.numA = 2;
        calc.numB = 3;
        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Multiplicação: " + calc.dividir());
        System.out.println("Divisão: " + calc.multiplicar());
        System.out.println("0: " + calc.VerificarNumeroPrimo(0));
        System.out.println("1: " + calc.VerificarNumeroPrimo(1));



    }

}         