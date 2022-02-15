public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoMarcos = new Conta();
        contaDoMarcos.saldo = 100;
        contaDoMarcos.deposita(50);
        System.out.println(contaDoMarcos.saldo);

        boolean conseguiuRetirar = contaDoMarcos.saca(20);
        System.out.println(contaDoMarcos.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        boolean sucessoTransferencia = contaDaMarcela.transfere(3000,contaDoMarcos);
        if(sucessoTransferencia){
            System.out.println("tranferencia com sucesso");
        }else{
            System.out.println("Faltou dinheiro");
        }

        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoMarcos.saldo);

    }
}
