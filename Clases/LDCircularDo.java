package Clases;

public class LDCircularDo {
	NodoDo p;
	
	LDCircularDo(){
		p=null;
	}
	
	public NodoDo getP() {
		return p;
	}

	public void setP(NodoDo p) {
		this.p = p;
	}

	public void adicionarf(Beneficiario a,LSimpleR b) {
		NodoDo nue =  new NodoDo();
		nue.setB(a);
		nue.setLr(b);
		if(getP()==null) {
			setP(nue);
			nue.setSig(nue);
			nue.setAnt(nue);
		}
		else {
			NodoDo w =  getP();
			while(w.getSig()!=getP()) {
				w=w.getSig();
			}
			w.setSig(nue);
			nue.setAnt(w);
			nue.setSig(getP());
			getP().setAnt(nue);
		}
	}
	public void adicionari(Beneficiario a,LSimpleR b) {
		NodoDo nue = new NodoDo();
		nue.setB(a);
		nue.setLr(b);
		if(getP()==null) {
			setP(nue);
			nue.setSig(nue);
			nue.setAnt(nue);
		}else {
			NodoDo w = getP();
			NodoDo fin = w.getAnt();
			w.setAnt(nue);
			nue.setSig(w);
			fin.setSig(nue);
			nue.setAnt(fin);
			setP(nue);
		}
	}
	public void mostrar() {
		NodoDo as = getP();
		System.out.println("Lista de Donaciones");
		while(as.getSig()!=getP()) {
			as.getB().mostrar();
			as.getLr().mostrar();
		}
		as.getB().mostrar();
		as.getLr().mostrar();
	}
}
