
import java.util.Scanner;



public class App {

    //DECLARAÇÃO DAS VARIÁVEIS
        
        static int nota1;
        static int nota2;
        static int nota3;
        static int media;

    public static void main(String[] args) {

        //METODO DE ESCANEAR COM FECHAMENTO DO SCANNER
            //CRIAÇÃO DO OBJETO PARA LER OS NUMEROS
        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Insira a nota 01: ");
                nota1 = scanner.nextInt();
            //Leitura da Nota 01
            System.out.println("Insira a nota 02: ");
                nota2 = scanner.nextInt();
            //Leitura da Nota 02
            System.out.println("Insira a nota 03: ");
                nota3 = scanner.nextInt();
            //Leitura da nota 03
        

                    System.out.println("Calculando a média...");
                    //CHAMANDO A FUNÇÃO PARA FAZER O CALCULO
                    avaliar(args);
        }   
    }
    
    public static void avaliar(String[] args) {

        media = (nota1 + nota2 + nota3)/3;
    
    if(media >= 7){
        System.out.println("Aluno aprovado!");
    }else{
        System.out.println("Aluno Reprovado");
        main(args);
    }
    }

}