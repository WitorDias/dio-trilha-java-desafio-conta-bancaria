package banco;
import java.util.List;

import banco.cliente.Cliente;
import banco.conta.Conta;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public List<Cliente> imprimirListaClientes(List<Cliente> clientes) {
		System.out.println("Lista de clientes: " + clientes);
		return clientes;
	}

}
