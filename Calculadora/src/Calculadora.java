
import java.util.Scanner;



public class Calculadora{

    //OBJETO SCANNER
    static Scanner scanner = new Scanner(System.in);

    //TAMANHO DO ARRAY
    static int tamanho;
    static int[] numeros = new int[tamanho];
    
    

public static void main(String[] args) {

    int opr;

    System.out.println("Quantos numeros voce deseja usar: ");
    tamanho = scanner.nextInt();

    try(Scanner scan = new Scanner(System.in)){
        System.out.println("Insira a operacao que deseja usar: \n[1]-Adicao\n[2]-Subtracao\n[3]-Multiplicacao\n[4]-Divisao");
                opr = scan.nextInt();
    }
        switch (opr) {

                case 1://ADIÇÃO
                System.out.println("Direcionando...\n");
                add(args);
                break;

                case 2: //SUBTRAÇÃO
                System.out.println("Direcionando...\n");
                sub(args);
                break;

                case 3: //MULTIPLICAÇÃO
                System.out.println("Direcionando...\n");
                mult(args);
                break;

                case 4: //DIVISÃO
                System.out.println("Direcionando...\n");
                div(args);
                break;

                default: // VALOR DE RETORNO INVALIDO
                System.out.println("Operacao invalida! \n Digite novamente...");
                main(args);
        }
    }


    public static void add(String[] args) {
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "º numero: ");
            numeros[i] = scanner.nextInt();
        }

        for(int numero : numeros){
            soma = soma + numero;
        }
    }

    public static void sub(String[] args) {
        System.out.println("Metodo chamado com sucesso");
        
    }

    public static void mult(String[] args) {
        System.out.println("Metodo chamado com sucesso");
        
    }

    public static void div(String[] args) {
        System.out.println("Metodo chamado com sucesso");
        
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









