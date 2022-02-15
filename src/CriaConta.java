public class CriaConta {
    public static void main(String[] args) {

       Conta primeiraConta = new Conta();
        primeiraConta.saldo=200;

        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.titular);
        primeiraConta.saldo+=100;
        System.out.println(primeiraConta.saldo);
        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;
        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.titular);
        segundaConta.agencia=146;
        System.out.println("Agora a segunda conta esta na agencia " + segundaConta.agencia);
        if(primeiraConta==segundaConta){
            System.out.println("mesma conta");
        }else{
            System.out.println("Contas diferentes");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
