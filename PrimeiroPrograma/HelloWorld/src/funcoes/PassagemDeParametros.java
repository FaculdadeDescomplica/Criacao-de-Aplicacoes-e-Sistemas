package funcoes;

public class PassagemDeParametros {

    // Metodo que tenta modificar um valor primitivo (passagem por valor)
    public static void modificarValor(int numero) {
        numero = numero * 2; // Esta alteração não afetará a variável original
        System.out.println("Dentro do método (valor primitivo): " + numero);
    }

    // Metodo que modifica um objeto (passagem por referência)
    public static void modificarObjeto(Pessoa pessoa) {
        pessoa.nome = "João"; // Modifica o estado do objeto, o que será refletido fora do metodo
    }

    // Metodo que tenta reatribuir uma referência (não afeta a referência original)
    public static void reatribuirObjeto(Pessoa pessoa) {
        pessoa = new Pessoa(); // Tenta criar um novo objeto, mas não afeta a referência original
        pessoa.nome = "Maria"; // Este nome não será refletido fora do metodo
        System.out.println("De dentro da função reatribuir = " + pessoa.nome);
    }

    public static void main(String[] args) {
        // Passagem por valor (primitivos)
        int numero = 10;
        System.out.println("Antes do método (valor primitivo): " + numero);
        modificarValor(numero);
        System.out.println("Depois do método (valor primitivo): " + numero);

        System.out.println("\n ---------- ");
        // Passagem por referência (objetos)
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Carlos";
        System.out.println("\nAntes do método (objeto): " + pessoa.nome);
        modificarObjeto(pessoa);
        System.out.println("Depois do método (objeto): " + pessoa.nome);

        // Tentativa de reatribuição de referência
        reatribuirObjeto(pessoa);
        System.out.println("Após tentar reatribuir (objeto): " + pessoa.nome);
    }
}

// Classe simples para exemplo de objeto
class Pessoa {
    String nome;
}
