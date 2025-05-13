package Clases;

public class LDCircularCS {
	private NodoCS p;
	
	LDCircularCS(){
		p=null;
	}

	public NodoCS getP() {
		return p;
	}

	public void setP(NodoCS p) {
		this.p = p;
	}
	public void adicionarf(CampañaSolidaria a) {
		NodoCS nue =  new NodoCS();
		nue.setCs(a);
		if(getP()==null) {
			setP(nue);
			nue.setSig(nue);
			nue.setAnt(nue);
		}
		else {
			NodoCS w =  getP();
			while(w.getSig()!=getP()) {
				w=w.getSig();
			}
			w.setSig(nue);
			nue.setAnt(w);
			nue.setSig(getP());
			getP().setAnt(nue);
		}
	}
	public void adicionari(CampañaSolidaria a) {
		NodoCS nue = new NodoCS();
		nue.setCs(a);
		if(getP()==null) {
			setP(nue);
			nue.setSig(nue);
			nue.setAnt(nue);
		}else {
			NodoCS w = getP();
			NodoCS fin = w.getAnt();
			w.setAnt(nue);
			nue.setSig(w);
			fin.setSig(nue);
			nue.setAnt(fin);
			setP(nue);
		}
	}
	public void mostrar() {
		NodoCS as = getP();
		System.out.println("Lista de Campaña Solidaria");
		while(as.getSig()!=getP()) {
			as.getCs().mostrar();
		}
		as.getCs().mostrar();
	}
}
