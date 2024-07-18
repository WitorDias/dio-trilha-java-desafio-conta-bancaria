import java.util.Arrays;
import java.util.List;

import banco.Banco;
import banco.cliente.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("venilton");
		List<Cliente> listaClientes = Arrays.asList(new Cliente("pedro"), new Cliente("laura"), new Cliente("camila"));
		Banco operacaoBancaria = new Banco();
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		operacaoBancaria.imprimirListaClientes(listaClientes);
	}

}
