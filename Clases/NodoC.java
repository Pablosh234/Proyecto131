package Clases;

public class NodoC {
	private Ciudad ciudad;
			NodoC ant,sig;
			
	NodoC(){
		ant=sig=null;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public NodoC getAnt() {
		return ant;
	}

	public void setAnt(NodoC ant) {
		this.ant = ant;
	}

	public NodoC getSig() {
		return sig;
	}

	public void setSig(NodoC sig) {
		this.sig = sig;
	}
	
}
