import java.util.ArrayList;

public class Turma {
	private String name;
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Turma(){}
	public Turma(String name, ArrayList<Disciplina> disciplinas) {
		this.name = name;
		this.disciplinas = disciplinas;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	

	
}
