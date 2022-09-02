package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        String sobrenome;
        Double saldo;

        System.out.print("Por favor, digite as informações abaixo. \n");

        System.out.print("Número da conta: \n");
        numero = sc.nextInt();

        System.out.print("Código da agência: \n");
        agencia = sc.next();

        System.out.print("Informe o seu saldo: \n");
        saldo = sc.nextDouble();

        System.out.print("Informe o seu nome: \n");
        nome = sc.next();

        System.out.print("Informe o seu sobrenome: \n");
        sobrenome = sc.next();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + ", e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
