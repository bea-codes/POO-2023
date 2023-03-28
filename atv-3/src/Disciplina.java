public class Disciplina {
	private String name;
	private int id;
	private int horas;
	private Professor professor; // professor -> ministra -> disciplina
	
	public Disciplina(){}
	public Disciplina(String name, int id, int horas, Professor professor) {
		this.name = name;
		this.id = id;
		this.horas = horas;
		this.professor = professor;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
