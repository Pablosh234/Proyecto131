package Clases;

public class Encargado extends Persona{
	private int id_encargado;
	
	public Encargado(String a, String b, String c, int d, int e, int f) {
		super(a,b,c,d,e);
		id_encargado=f;
	}

	public int getId_encargado() {
		return id_encargado;
	}

	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
	}
	public void mostrar() {
        super.mostrar();
        System.out.print(" ID Encargado: "+id_encargado);
    }
}
