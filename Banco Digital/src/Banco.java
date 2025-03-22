
import java.util.Scanner;

public class Banco{

    public double saldo;

    public Banco(double saldoInicial){
        //Saldo que se inicia ao começar a usar as operações
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        //Realiza o deposito apenas se o valor foi maior que 0;
        if(valor > 0){
            System.out.println("Valor depositado com sucesso");;

        }else{
            System.out.println("Valor invalido para deposito");
        }
    }

    public void verSaldo(){
        System.out.println("O valor do seu saldo e: " + saldo);
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            valor -= saldo;
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public static void main(String[] args) {
        
        Scanner select = new Scanner(System.in);
        //Define o saldo inicial como sendo 1000 Reais
        Banco conta =  new Banco(1000.0);
        int opcao;
        
        do{
        System.out.println("----Bem-vindo ao Banco Uniceub----");
        System.out.println("\n----------------------------------\n");
        System.out.println("[1]-Ver o saldo");
        System.out.println("[2]-Sacar");
        System.out.println("[3]-Depositar");
        System.out.println("\n----------------------------------\n");
        System.out.println("Escolha uma opcao: ");
        //Escaneia e seleciona a opção que se deseja fazer
        opcao = select.nextInt();

            switch(opcao){
            case 1:
            conta.verSaldo();
            break;

            case 2:
            System.out.println("Digite o Valor do saque: ");
            double saque = select.nextDouble();
            conta.sacar(saque);
            break;

            case 3:
            System.out.println("Digite o valor do deposito");
            double deposito = select.nextDouble();
            conta.depositar(deposito);
            break;

            default:
            System.out.println("Modo invalido!");
            }
        }while(opcao != 0);
        select.close();
    }
}