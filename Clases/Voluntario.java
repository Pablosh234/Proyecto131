package Clases;

public class Voluntario extends Persona{
	private int id_voluntario;
	
	public Voluntario(String a, String b, String c, int d, int e, int f) {
		super(a,b,c,d,e);
		id_voluntario=f;
	}

	public int getId_voluntario() {
		return id_voluntario;
	}

	public void setId_voluntario(int id_voluntario) {
		this.id_voluntario = id_voluntario;
	}
	public void mostrar() {
        super.mostrar();
        System.out.print(" ID Voluntariio " + id_voluntario);
    }
}
