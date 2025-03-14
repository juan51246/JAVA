
import java.util.Scanner;



public class Calculadora{

    //OBJETO SCANNER
    static Scanner scanner = new Scanner(System.in);

    //TAMANHO DO ARRAY
    static int tamanho;
    
    

    public static void main(String[] args) {

    try(Scanner scan = new Scanner(System.in)){

            int opr;

            System.out.println("Quantos numeros voce deseja usar: ");
            tamanho = scanner.nextInt();

            System.out.println("Insira a operacao que deseja usar: \n [+][-][/][*]");
                opr = scan.nextInt();   

            switch (opr) {

                case '+'://ADIÇÃO
                    add(args);

                case '-': //SUBTRAÇÃO
                    sub(args);

                case '*': //MULTIPLICAÇÃO
                    mult(args);

                case '/': //DIVISÃO
                    div(args);

                default: // VALOR DE RETORNO INVALIDO
                System.out.println("Operacao invalida! \n Digite novamente...");
                main(args);
            }

        }
    }
//CRIANDO O ARRAY
static int[] numeros = new int[tamanho];
    //ADIÇÃO
    public static void add(String[] args) {
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "º numero: ");
            numeros[i] = scanner.nextInt();
        }

        for(int numero : numeros){
            soma = soma + numero;
        }
        exec(args);
    }
    //SUBTRAÇÃO
    public static void sub(String[] args) {
        exec(args);
    }
    //MULTIPLICAÇÃO
    public static void mult(String[] args) {
        exec(args);
    }
    //DIVISÃO
    public static void div(String[] args) {
        exec(args);
    }

public static void exec(String[] args) {

    boolean confirm;

    System.out.println("Deseja retornar ao menu principal: [true] [false]");
    confirm = scanner.nextBoolean();

    if (confirm) {
        System.out.println("Retornando ao menu principal...");
        main(args);
    }

}
}









