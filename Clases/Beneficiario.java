package Clases;

public class Beneficiario extends Persona {
	private int id_beneficiario;

	public Beneficiario(String a, String b, String c, int d, int e, int f) {
		super(a,b,c,d,e);
		id_beneficiario=f;
	}

	
	public int getId_beneficiario() {
		return id_beneficiario;
	}


	public void setId_beneficiario(int id_beneficiario) {
		this.id_beneficiario = id_beneficiario;
	}


	public void mostrar() {
	    super.mostrar();
	    System.out.print(" ID Voluntariio " + id_beneficiario);
	}

}