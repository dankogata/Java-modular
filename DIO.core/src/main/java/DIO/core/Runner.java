package DIO.core;


import DIO.utils.Operacao.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(1,2));
        System.out.println(calculadora.div(4,2));
        System.out.println(calculadora.multi(1,2));
        System.out.println(calculadora.sub(5,2));
    }
}
