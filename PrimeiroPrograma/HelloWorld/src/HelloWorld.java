public class HelloWorld {

    public static void main(String [] args){

        System.out.println("Hello, world!");

        // 8 bits, intervalo de -128 a 127
        byte oitoBits = 100;

        // 16 bits, intervalo de -32,768 a 32,767
        short numeroMuitoPequeno = 32;

        // 32 bits, intervalo de -2^31 a 2^31-1
        int inteiro = 32000;

        // 64 bits, intervalo de -2^63 a 2^63-1
        long numeroMuitoGrande = 164000;

        // 32 bits, ponto flutuante de precisão simples
        float decimalSimples = 31;

        // 64 bits, ponto flutuante de precisão dupla
        double decimalPreciso = 34.5;

        // 16 bits, caracter Unicode
        char caractere = 'a';

        // true ou false
        boolean teste = true;

        System.out.println(oitoBits);
        System.out.println(numeroMuitoPequeno);
        System.out.println(inteiro);
        System.out.println(numeroMuitoGrande);
        System.out.println(decimalSimples);
        System.out.println(decimalPreciso);
        System.out.println(caractere);
        System.out.println(teste);
    }
}
