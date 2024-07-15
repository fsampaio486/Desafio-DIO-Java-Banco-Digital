package ProjetoBancario;

public class contaPoupanca extends Conta {
	
	public contaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimeExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		System.out.println();
		super.imprimirInfosComuns();
		System.out.println();
	}

}
