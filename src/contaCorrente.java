package ProjetoBancario;

public class contaCorrente extends Conta{
	
	public contaCorrente(Cliente cliente) {
		super (cliente);
	}
	
	@Override
	public void imprimeExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		System.out.println();
		super.imprimirInfosComuns();
		System.out.println();

	}

}
