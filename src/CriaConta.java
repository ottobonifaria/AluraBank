public class CriaConta {
    public static void main(String[] args) {

       Conta primeiraConta = new Conta();
        primeiraConta.saldo=200;
        primeiraConta.titular="João";
        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.titular);
        primeiraConta.saldo+=100;
        System.out.println(primeiraConta.saldo);
        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;
        System.out.println(segundaConta.saldo);
    }
}
