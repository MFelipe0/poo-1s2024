package aula2;

public class Main {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.numA = 5.0;
        calc.numB = 3.0;

        System.out.println("Multiplicação: " + calc.multiplicação());
    }
}
             