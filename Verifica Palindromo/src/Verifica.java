import java.util.Scanner;

public class Verifica{

    static String world;
    static String invert;

    //FUNÇÃO ONDE IRA INSERIR A PALAVRA
    public static void main(String[] args) {
    
    //ATRIBUIÇÃO DA PALAVRA
    try(Scanner scanner = new Scanner(System.in)){
        System.out.println("Insira a palavra a ser verificada: ");
        world = scanner.nextLine().toLowerCase();
            invert = new StringBuilder(world).reverse().toString();
        }  
        palindromo(args);
    }

    //VERIFICAÇÃO DO PALINDROMO
    public static void palindromo(String[] args) {
        if(world.equals(invert)){
            System.out.println("A palavra " + world + " e um palindromo");
        }else{
            System.out.println("A palavra " + world + " nao e um palindromo");
        }
        exec(args);
    }
    
    //COMPARAR OUTRA PALAVRA
    public static void exec(String[] args) {
        boolean exe;

        //QUESTIONAMENTO SE DESEJA COMPARAR OUTRA PALAVRA
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Deseja comparar outra palavra: ");
            exe = scanner.nextBoolean();
        }
        if(exe){
        main(args);
        }
    }
}
