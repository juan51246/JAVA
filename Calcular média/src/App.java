
import java.util.Scanner;



public class App {

    //DECLARAÇÃO DAS VARIÁVEIS
        
        static int nota1;
        static int nota2;
        static int nota3;
        static int av;
        static int media;

    public static void main(String[] args) {

        //METODO DE ESCANEAR COM FECHAMENTO DO SCANNER
            //CRIAÇÃO DO OBJETO PARA LER OS NUMEROS
        try(Scanner scanner = new Scanner(System.in)){

        //PARAMETRO DE AVALIAÇÃO
        System.out.println("Insira a media de avaliacao: ");
        media = scanner.nextInt();

            //LEITURA DE NOTAS
            System.out.println("Insira a nota 01: ");
                nota1 = scanner.nextInt();
            System.out.println("Insira a nota 02: ");
                nota2 = scanner.nextInt();
            System.out.println("Insira a nota 03: ");
                nota3 = scanner.nextInt();

        

                    System.out.println("Calculando a média...");
                    //CHAMANDO A FUNÇÃO PARA FAZER O CALCULO
                    avaliar(args);
        }   
    }
    
    public static void avaliar(String[] args) {

        av = (nota1 + nota2 + nota3)/3;
    
    if(av >= media){
        System.out.println("Aluno aprovado!");
        exec(args);
    }else{
        System.out.println("Aluno Reprovado");
        exec(args);
    }
    }
    
    public static void exec(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){

            int av;
                //QUESTIONANDO O USUARIO SOBRE REALIZAR UM NOVO CALCULO
                System.out.println("Deseja Calcular novamente: ");
                System.out.println("Digite ´[1] Para sim / Digite [2] para nao...");
                av = scanner.nextInt();

            if(av == 1){
                System.out.println("Redirecionando...");

            }else{
                System.out.println("Obrigado por calcular! \n Até logo!");
            }
        }
    }
}