package Clases;

public class MultiColaEV {
	private int n;
	ColaV v[] =  new ColaV[50];
	
MultiColaEV() {
for(int i=1;i<=49;i++) {
	v[i]=new ColaV(null);
}
}

public int getN() {
return n;
}

public void setN(int n) {
this.n = n;
}
public boolean esvacia(int i) {
return v[i].esvacia();
}
public boolean esllena(int i) {
return v[i].esllena();
}
public int nroelem(int i) {
return v[i].nroelem();
}
public void adicionar(int i, Voluntario elem) {
v[i].adicionar(elem);
}
public Voluntario eliminar(int i) {
return v[i].eliminar();
}
public void mostrar(int i) {
v[i].mostrar();
}
public void mostrar() {
for(int i=1;i<=n;i++) {
	mostrar(i);
}
}
void vaciar(int i, ColaV Z)
{
v[i].vaciar(Z);
}
void vaciar(int i, int j)
{
v[i].vaciar(v[j]);
} 		
}
