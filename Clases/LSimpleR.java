package Clases;


public class LSimpleR {
private NodoR p;
	
	LSimpleR(){
		p=null;
	}

	public NodoR getP() {
		return p;
	}

	public void setP(NodoR p) {
		this.p = p;
	}
	
	public void adifin(ColaA a, Donador d) {
		NodoR z = new NodoR();
		z.setCa(a);
		z.setD(d);
		if(getP()==null) {
			setP(z);
		}
		else {
			NodoR w = getP();
			while(w.getSig() != null) {
				w =  w.getSig();
			}
			w.setSig(z);
		}
	}
	public void mostrar() {
		NodoR r = getP();
		System.out.println("Lista de Recoleccion");
		while(r != null) {
			r.getD().mostrar();
			r.getCa().mostrar();
			r = r.getSig();
		}
	}
}
