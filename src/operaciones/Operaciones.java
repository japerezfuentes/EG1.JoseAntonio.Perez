package operaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operaciones {

	public static void main (String args[]) throws IOException, Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.print("selecciona una opcion del menu e introduce los valores correspondientes: ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("valor 1: ");		

	}
}
