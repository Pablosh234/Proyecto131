package Clases;

public class Donador extends Persona {
	private int id_donador;
	
	public Donador(String a, String b, String c, int d, int e, int f) {
		super(a,b,c,d,e);
		id_donador=f;
	}

	public int getId_donador() {
		return id_donador;
	}

	public void setId_donador(int id_donador) {
		this.id_donador = id_donador;
	}
	public void mostrar() {
		super.mostrar();
		System.out.print(" ID donador"+id_donador);
	}
}
