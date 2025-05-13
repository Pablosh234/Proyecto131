package Clases;

public class NodoR {
	private ColaA ca;
			Donador d;
			NodoR sig;
			
	NodoR(){
		sig=null;
	}

	public ColaA getCa() {
		return ca;
	}

	public void setCa(ColaA ca) {
		this.ca = ca;
	}

	public Donador getD() {
		return d;
	}

	public void setD(Donador d) {
		this.d = d;
	}

	public NodoR getSig() {
		return sig;
	}

	public void setSig(NodoR sig) {
		this.sig = sig;
	}
}
