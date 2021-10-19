import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void recarga() {
        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        Telefone telefone = new Telefone();
        telefone.setNumeroLinha("81994922239");
        telefone.setSaldo(10);
        conta.setSaldo(100);
        cliente.setNome("Luiz");
        cliente.setConta(conta);
        cliente.setLinha(telefone);

        Recarga teste = new Recarga();
        teste.recarga(cliente, 80);

        Assert.assertEquals("Validando Saldo da Conta",cliente.getConta().getSaldo(), 20);
        Assert.assertEquals("Validando Saldo da linha do Telefone",cliente.getTelefone().getSaldo(), 90);

    }
}