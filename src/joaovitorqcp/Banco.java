package joaovitorqcp;

public class Banco {

	public static void main(String[] args) {
		Correntista correntista1 = new Correntista(123, "Paulo");
		Correntista correntista2 = new Correntista(456, "Roberta");
		
		Conta conta1 = new ContaCorrente(694, 3, 1512, correntista1, 500);
		Conta conta2 = new ContaPoupanca(777, 5, 4356, correntista2, 0.1);
		
		conta1.verificarSaldo(1510);
		conta1.verificarSaldo(1512);
		conta1.depositar(1000);
		conta1.verificarSaldo(1512);
		conta1.sacar(1600, 1511);
		conta1.sacar(1600, 1512);
		conta1.sacar(1500, 1512);
		conta1.verificarSaldo(1512);
		
		conta2.verificarSaldo(4352);
		conta2.verificarSaldo(4356);
		conta2.depositar(1000);
		conta2.verificarSaldo(4356);
		conta2.sacar(1200, 4353);
		conta2.sacar(1200, 4356);
		conta2.sacar(1100, 4356);
		conta2.verificarSaldo(4356);
	}

}
