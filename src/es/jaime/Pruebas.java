package es.jaime;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sup=10;
		int inf=0;
		int numerico;
		int cuentaInferior=0;
		int cuentaSuperior=0;
		int cuentaFuera=0;
		for (int i=0;i<=1000000;i++) {
			numerico = MétodosNúmeroAleatorio.numeroAleatorio(inf,sup);
			if (numerico==inf) {
				cuentaInferior++;
			} else if (numerico==sup) {
				cuentaSuperior++;
			} else if (numerico>sup) {
				cuentaFuera++;
			}
		}
		System.out.println(cuentaInferior);
		System.out.println(cuentaSuperior);
		System.out.println(cuentaFuera);
	}

}
