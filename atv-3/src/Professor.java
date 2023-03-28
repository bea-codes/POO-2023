import java.util.ArrayList;

public class Professor {
	private String name;
	private String email;
	private int id;
	private ArrayList<Universidade> universidades = new ArrayList<Universidade>() ; // Professor -> trabalha -> universidade 1:N
	
	public Professor(){}
	public Professor(String name, String email, int id, ArrayList<Universidade> universidades) {
		this.name = name;
		this.email = email;
		this.id = id;
		this.universidades = universidades;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Universidade> getUniversidades() {
		return universidades;
	}
	public void setUniversidades(ArrayList<Universidade> universidades) {
		this.universidades = universidades;
	}
	


}
