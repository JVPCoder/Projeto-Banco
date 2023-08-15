package joaovitorqcp;

public class ContaCorrente extends Conta{

	private double limite;
	
	public ContaCorrente(int agencia, int conta, int senha, Correntista correntista, double limite) {
		super(agencia, conta, senha, correntista);
		this.limite = limite;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void sacar(double valor, int senha) {
		if(senha == this.getSenha()) {
			if(valor <= (this.getSaldo() + this.getLimite())) {
				this.saldo -= valor;
			}else {
				System.out.println("Saldo e limite indisponível para este saque");
			}
		}else {
			System.out.println("Senha incorreta");
		}
		
	}

	public double getLimite() {
		return limite;
	}
    
	
}
