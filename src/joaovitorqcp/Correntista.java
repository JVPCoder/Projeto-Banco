package joaovitorqcp;

public class Correntista {
	private long cpf;
	private String nome;
	
	public Correntista(long cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public long getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}
	
	
}
