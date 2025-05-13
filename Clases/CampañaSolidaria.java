package Clases;

public class CampañaSolidaria {
	private String nombre,tipo;
			MultiColaEV mcev;
			
	CampañaSolidaria(String a, String b,MultiColaEV c){
		nombre=a;
		tipo=b;
		mcev=c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public MultiColaEV getMcev() {
		return mcev;
	}

	public void setMcev(MultiColaEV mcev) {
		this.mcev = mcev;
	}
	public void mostrar() {
		System.out.println("Campania Solidaria: "+nombre+" Tipo: "+tipo);
		mcev.mostrar();
	}
			
	
}
