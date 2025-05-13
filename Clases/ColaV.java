package Clases;


public class ColaV {
	private int max=50;
    private Voluntario v[]=new Voluntario[max+1];
    private int ini,fin;
    Encargado en;
    public Encargado getEn() {
		return en;
	}

	public void setEn(Encargado en) {
		this.en = en;
	}
    public ColaV(Encargado a)
    {
        ini=fin=0;
        en=a;
    }

	public boolean esvacia ()
    {
	if (ini == 0 && fin == 0)
	    return (true);
	return (false);
    }
    public boolean esllena ()
    {
	if (fin == max)
	    return (true);
	return (false);
    }
    public int nroelem ()
    {
	return (fin - ini);
    }
    public void adicionar (Voluntario elem)
    {
	if (!esllena ())
	{
	    fin++;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola Simple llena");
    }
    public Voluntario eliminar ()
    {
        Voluntario elem = null;
	if (!esvacia ())
	{
	    ini++;
	    elem = v [ini];
	    if (ini == fin)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola Simple vacia");
	return (elem);
    }
    public void mostrar ()
    {
        Voluntario elem;
	if (esvacia ())
	    System.out.println ("Cola vacia");
	else
	{
	    System.out.println (" Cola de Voluntarios ");
	    ColaV aux = new ColaV (en);
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }
    public void vaciar (ColaV a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
}
