package Clases;

public class LSimpleC {
	private NodoC p;
	
	LSimpleC(){
		p=null;
	}

	public NodoC getP() {
		return p;
	}

	public void setP(NodoC p) {
		this.p = p;
	}
	public void adiprinc(Ciudad ciu) {
		NodoC nue =  new NodoC();
		nue.setCiudad(ciu);
		
		nue.setSig(getP());
		setP(nue);
	}
	public void mostrar() {
		NodoC z = getP();
		System.out.println("ListAa de Buses");
		while(z != null) {
			z.getCiudad().mostrar();
			z = z.getSig();
		}
	}
}
