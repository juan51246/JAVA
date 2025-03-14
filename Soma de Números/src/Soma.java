import java.util.Scanner;

public class Soma{

    //VARIÁVEIS
    static int num1;
    static int num2;
    static int num3;
    static int soma;

    public static void main(String[] args) {

      //CRIANDO O OBJETO QUE ESCANEARÁ OS NUMEROS
    try(Scanner scanner = new Scanner(System.in)){
        //IMPRIME O COMANDO NA TELA, E ATRIBUI O VALOR A VARIAVEL
        System.out.println("insira o Primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.println("insira o Segundo numero: ");
        num2 = scanner.nextInt();

        System.out.println("insira o Terceiro numero: ");
        num3 = scanner.nextInt();
    } //SCANNER CLOSED()

    //RESULTADO E IMPRESSÃO DA SOMA DOS NUMEROS
    soma = num1 + num2 + num3;
        System.out.println("o resultado da soma e: " + soma);

    //CHAMANDO A OUTRA FUNÇÃO
    verifica(args);
    }

    public static void verifica(String[] args) {
            System.out.println("Verificando se o numero e par ou impar...");
    
    //FAZENDO VERIFICAÇÃO DO NUMERO

    //VERIFICA SE O RESULTADO DA SOMA É IGUAL A 0, SE FOR, É PAR, SE NÃO É IMPAR
    if(soma%2 == 0 ){
            System.out.println("O resultado " + soma + "e par");
    }
    else{
        System.out.println("o resultado " + soma + " e impar");
    }
   }
}