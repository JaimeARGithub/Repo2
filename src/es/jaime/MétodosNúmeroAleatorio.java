package es.jaime;

public class MétodosNúmeroAleatorio {

		public static int numeroAleatorio(int inferior, int superior) {
			int resultado = (int) ((Math.random())*(superior-inferior+1)+inferior);
			return resultado;
		}
}
