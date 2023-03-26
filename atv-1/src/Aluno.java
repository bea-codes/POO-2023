public class Aluno {
	private String nome;
	private String email;
	private int numeroDeMatricula;

	public Aluno (){}

	public Aluno(String nome, String email, int numeroDeMatricula) {
		this.nome = nome;
		this.email = email;
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	};
	

	
}
