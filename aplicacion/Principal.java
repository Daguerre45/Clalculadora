package aplicacion;
import java.util.*;
import java.io.*;

public class Principal{

	public static void main(String[] args) {
		Scanner sc = new Scanner();
		System.out.println("Que operación quiere realizar?");
		String operacion = sc.next();
		if(operacion != "+" || operacion != "-" || operacion != "*" || operacion != "/"){
			System.out.println("la operación seleccionada no es válida");
		}
		sc.close();
	}


}