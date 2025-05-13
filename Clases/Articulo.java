package Clases;

public class Articulo {
	private int id_articulo,id_beneficiario;
			String tipo,nombre;
	Articulo(int a, String b, String c, int d){
		id_articulo=a;
		tipo=b;
		nombre=c;
		id_beneficiario=d;
	}
	public int getId_articulo() {
		return id_articulo;
	}
	public void setId_articulo(int id_articulo) {
		this.id_articulo = id_articulo;
	}
	public int getId_beneficiario() {
		return id_beneficiario;
	}
	public void setId_beneficiario(int id_beneficiario) {
		this.id_beneficiario = id_beneficiario;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void mostrar() {
		System.out.println("Articulo: "+nombre+" tipo: "+tipo+" ID Articulo: "+id_articulo);
	}
}
