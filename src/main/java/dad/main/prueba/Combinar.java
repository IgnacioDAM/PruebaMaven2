package dad.main.prueba;

public class Combinar {
	
	public static String combinar(Object[] tabla) {
		String texto = null;
		int i=0;
		texto = tabla[i] + " ";
		for(i=1; i < tabla.length-1; i++)
			texto += tabla[i] + " ";
		texto += tabla[i];
		return texto;
	}
	
	public static void main(String[] args) {
		Object [] array = {"Hola", 3.1416 , "Adios", 15, true};
		String resultado = combinar(array); //Hola  3,1416 Adios 15 True
		System.out.println(resultado);
	}

}
