import java.util.ArrayList;

public class Universidade {
	private String name;
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public Universidade(){}
	public Universidade(String name, ArrayList<Curso> cursos) {
		this.name = name;
		this.cursos = cursos;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
}
