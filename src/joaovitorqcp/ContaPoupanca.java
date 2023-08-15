package joaovitorqcp;

public class ContaPoupanca extends Conta{

	private double rendimento;
	
	public ContaPoupanca(int agencia, int conta, int senha, Correntista correntista, double rendimento) {
		super(agencia, conta, senha, correntista);
		this.rendimento = rendimento;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		this.saldo += this.calcularRendimento(this.getSaldo(), this.getRendimento());
	}

	@Override
	public void sacar(double valor, int senha) {
		if(senha == this.getSenha()) {
			if(valor <= this.getSaldo()) {
				this.saldo -= valor;
			}else {
				System.out.println("Saldo indisponível para este saque");
			}
		}else {
			System.out.println("Senha incorreta");
		}
		
		
	}

	private double calcularRendimento(double saldo, double rendimento) {
		return saldo * rendimento;
	}
	
	public double getRendimento() {
		return rendimento;
	}
	    
	
}
