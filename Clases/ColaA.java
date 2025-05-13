package Clases;

public class ColaA {
	private int max=50;
    private Articulo v[]=new Articulo[max+1];
    private int ini,fin;
    
    public ColaA()
    {
        ini=fin=0;
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
    public void adicionar (Articulo elem)
    {
	if (!esllena ())
	{
	    fin++;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola Simple llena");
    }
    public Articulo eliminar ()
    {
        Articulo elem = null;
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
        Articulo elem;
	if (esvacia ())
	    System.out.println ("Cola vacia");
	else
	{
	    System.out.println (" Cola de Articulos ");
	    ColaA aux = new ColaA ();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }
    public void vaciar (ColaA a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
}
