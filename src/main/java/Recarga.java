
public class Recarga {

    public void recarga(Cliente cliente, int recarga){

        if (recarga < cliente.getConta().getSaldo()){
           cliente.getConta().setRecarga(recarga);
           cliente.getConta().setSaldo(cliente.getConta().getSaldo() - cliente.getConta().getRecarga());
           System.out.println("Valor atual do saldo da conta é :" + cliente.getConta().getSaldo());
           cliente.getTelefone().setSaldo(cliente.getTelefone().getSaldo() + cliente.getConta().getRecarga());
            System.out.println("Valor atual do saldo do telefone é :" + cliente.getTelefone().getSaldo());
        }else {
            System.out.println("Saldo insuficiente para realizar a recarga");
        }

    }


}