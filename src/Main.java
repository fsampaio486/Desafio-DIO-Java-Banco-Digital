package ProjetoBancario;

public class Main {

	public static void main(String[] args) {
		
		Cliente Aparecida = new Cliente();
		Aparecida.setNomeCliente("Aparecrida");
		
		Conta contaCorrente = new contaCorrente(Aparecida);
		Conta poupanca = new contaPoupanca(Aparecida);

		contaCorrente.deposito(250);
		contaCorrente.tranferencia(50, poupanca);
		
		contaCorrente.imprimeExtrato();
		poupanca.imprimeExtrato();

	}

}
