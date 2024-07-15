package ProjetoBancario;

public abstract class Conta implements IConta {
	
	private static final int agenciaPadrao = 1;
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numeroConta;
	private double saldoConta;
	private Cliente cliente;
	
	public Conta() {
	}

	public Conta(Cliente cliente) {
		super();
		this.agencia = Conta.agenciaPadrao;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void saque(double valor) {
		saldoConta -= valor;
	}
	
	@Override
	public void deposito(double valor) {
		saldoConta += valor;
	}
	
	@Override
	public void tranferencia(double valor, IConta contaDestino) {
		this.saque(valor);
		contaDestino.deposito(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public double getNumeroConta() {
		return numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNomeCliente()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldoConta));
	}

}
