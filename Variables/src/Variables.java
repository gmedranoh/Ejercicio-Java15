
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int miVariableEntera = 10;
			System.out.println(miVariableEntera);
			//modificamos el valor de la variable
			miVariableEntera = 5;
			System.out.println(miVariableEntera);
			
			String miVariableCadena = "Saludos";
			System.out.println(miVariableCadena);
			
			miVariableCadena = "Adios";
			System.out.println(miVariableCadena);
			
			//var - Inferencia de tipos en Java 
			//para versiones de jdk 10 en adelante
			
			int miVariableEntera2 = 15;
			System.out.println(miVariableEntera2);
			
			// Valores permitidos en el nombre de variables
			int miVariable = 1;
			int _miVariable = 2;
			int $miVariable = 3;
			
			System.out.println(miVariable);
			
			///concatenacion
			
			String usuario = "Gaby";
			String titulo = "Ingeniera";
			String union = usuario + " " +titulo;
			System.out.println("resultado " + union);	
			
			int i = 3, j = 4;
			System.out.println(i + j); //se realiza la suma de los numeros
			System.out.println(union + i + j); //contexto cadena
			System.out.println(i + j + union);
			System.out.println(union + (i + j));
			
			//CARACTERES ESPECIALES
			String nombre = "Gaby";
			System.out.println("Nueva linea: \t\t" + nombre ); //tabulador
			System.out.println("Retroceso: \b\b" + nombre); //se pierde el caracter en blanco
			System.out.println("Comilla simpre: \'" + nombre + "\'"); 
			System.out.println("Comilla doble: \"" + nombre + "\"");
			
			
	}

}
