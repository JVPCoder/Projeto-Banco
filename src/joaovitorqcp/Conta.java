package joaovitorqcp;

public abstract class Conta {
	protected int agencia;
	protected int conta;
	protected int senha;
	protected double saldo;
	protected Correntista correntista;
	
	public Conta(int agencia, int conta, int senha, Correntista correntista) {
		this.agencia = agencia;
		this.conta = conta;
		this.senha = senha;
		this.saldo = 0;
		this.correntista = correntista;
	}
	
	public void verificarSaldo(int senha) {
		if(senha == this.getSenha()) {
			System.out.println("+============================+");
			System.out.println("Agência: " + this.getAgencia());
			System.out.println("Conta: " + this.getConta());
			System.out.println("Correntista: " + this.getCorrentista().getNome());
			System.out.println("Saldo: " + this.getSaldo());
			System.out.println("+============================+");
		}else {
			System.out.println("Senha incorreta");
		}
		
	}
	
	public abstract void depositar(double valor);
	public abstract void sacar(double valor, int senha);

	public int getAgencia() {
		return agencia;
	}


	public int getConta() {
		return conta;
	}


	public int getSenha() {
		return senha;
	}

	

	public Correntista getCorrentista() {
		return correntista;
	}


	public double getSaldo() {
		return saldo;
	}
	    
	
}
