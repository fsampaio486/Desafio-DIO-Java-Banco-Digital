package ProjetoBancario;

public interface IConta {
	
	void saque(double valor);
	
	void deposito(double valor);
	
	void tranferencia(double valor, IConta contaDestino);
	
	void imprimeExtrato();

}
