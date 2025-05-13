package Clases;

public class Persona {
	protected String nombre,pat,mat;
	protected int edad,ci;
 		
 	Persona(String a, String b, String c,int e,int d){
 		nombre=a;
 		pat=b;
 		mat=c;
 		edad=e;
 		ci=d;
 	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPat() {
		return pat;
	}

	public void setPat(String pat) {
		this.pat = pat;
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}
 	public void mostrar() {
 		System.out.println("Nombre: "+nombre+" Apellidos: "+pat+" "+mat+" Edad: "+edad+" CI: "+ci);
 	}
}
