public class TestaReferencia {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da Primeira Conta = " + primeiraConta.saldo);
        Conta segundaConta = primeiraConta;

        System.out.println("Saldo da segunda conta = " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta = " + segundaConta.saldo);
        System.out.println("Saldo da Primeira Conta = " + primeiraConta.saldo);
        if(primeiraConta==segundaConta){
            System.out.println("São as mesma conta");
        }

        if(primeiraConta==segundaConta){
            System.out.println("Mesma Conta");
        }else{
            System.out.println("Contas diferentes");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
