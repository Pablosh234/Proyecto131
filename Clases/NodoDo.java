package Clases;

public class NodoDo {
	private Beneficiario b;
			LSimpleR lr;
			NodoDo sig,ant;
	NodoDo(){
		sig=ant=null;
	}
	public Beneficiario getB() {
		return b;
	}
	public void setB(Beneficiario b) {
		this.b = b;
	}
	public LSimpleR getLr() {
		return lr;
	}
	public void setLr(LSimpleR lr) {
		this.lr = lr;
	}
	public NodoDo getSig() {
		return sig;
	}
	public void setSig(NodoDo sig) {
		this.sig = sig;
	}
	public NodoDo getAnt() {
		return ant;
	}
	public void setAnt(NodoDo ant) {
		this.ant = ant;
	}
}
