package Clases;

public class NodoCS {
	private CampañaSolidaria cs;
			NodoCS ant,sig;
			
	NodoCS(){
		ant=sig=null;
	}

	public CampañaSolidaria getCs() {
		return cs;
	}

	public void setCs(CampañaSolidaria cs) {
		this.cs = cs;
	}

	public NodoCS getAnt() {
		return ant;
	}

	public void setAnt(NodoCS ant) {
		this.ant = ant;
	}

	public NodoCS getSig() {
		return sig;
	}

	public void setSig(NodoCS sig) {
		this.sig = sig;
	}
}
