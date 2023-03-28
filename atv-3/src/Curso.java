import java.util.ArrayList;

public class Curso {
	private String name;
	private int totalHours;
	private Professor coordenador; // professor -> coordena -> curso 1:1
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>(); // curso -> contém -> Disciplinas 1:N
	private ArrayList<Turma> turmas = new ArrayList<Turma>(); // curso -> contém -> turmas 1:N
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	
	public Curso(){}
	public Curso(String name, int totalHours, Professor coordenador, ArrayList<Disciplina> disciplinas,
			ArrayList<Turma> turmas, ArrayList<Professor> professores) {
		this.name = name;
		this.totalHours = totalHours;
		this.coordenador = coordenador;
		this.disciplinas = disciplinas;
		this.turmas = turmas;
		this.professores = professores;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	public Professor getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public ArrayList<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	
}
