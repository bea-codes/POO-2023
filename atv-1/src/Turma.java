public class Turma {
	private int codigoDaTurma;
	private String[] alunos;
	private char periodo; // dia, noite, vespertino
	private int semestre;
	
	public Turma() {}

	public Turma(int codigoDaTurma, String[] alunos, char periodo, int semestre) {
		this.codigoDaTurma = codigoDaTurma;
		this.alunos = alunos;
		this.periodo = periodo;
		this.semestre = semestre;
	}

	public int getCodigoDaTurma() {
		return codigoDaTurma;
	}

	public void setCodigoDaTurma(int codigoDaTurma) {
		this.codigoDaTurma = codigoDaTurma;
	}

	public String[] getAlunos() {
		return alunos;
	}

	public void setAlunos(String[] alunos) {
		this.alunos = alunos;
	}

	public char getPeriodo() {
		return periodo;
	}

	public void setPeriodo(char periodo) {
		this.periodo = periodo;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	
}	
