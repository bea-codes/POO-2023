public class Disciplina {
	private String nome;
	private int numeroDisciplina;
	private String professor;
	private String horario;
	private String localAula;
	private Turma turma;

	public Disciplina(){}

	public Disciplina(String nome, int numeroDisciplina, String professor, String horario, String localAula,
			Turma turma) {
		this.nome = nome;
		this.numeroDisciplina = numeroDisciplina;
		this.professor = professor;
		this.horario = horario;
		this.localAula = localAula;
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDisciplina() {
		return numeroDisciplina;
	}

	public void setNumeroDisciplina(int numeroDisciplina) {
		this.numeroDisciplina = numeroDisciplina;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getLocalAula() {
		return localAula;
	}

	public void setLocalAula(String localAula) {
		this.localAula = localAula;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	
}
	