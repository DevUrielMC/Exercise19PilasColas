package com.exercise19stackandheaps.app;

import java.util.Stack;
public class StackandHeaps {

	public static void main(String[] args) {
		String cad="es, seg�n la definici�n tradicional del t�rmino, el arte de organizar sensible y l�gicamente una combinaci�n coherente de sonidos y silencios respetando los principios fundamentales de la melod�a, la armon�a y el ritmo, mediante la intervenci�n de complejos procesos psicoan�micos. El concepto de m�sica ha ido evolucionando desde su origen en la Antigua Grecia, en que se reun�a sin distinci�n a la poes�a, la m�sica y la danza como arte unitario.";
		
		Stack<Character> letters = new Stack<Character>();
		
		//navega atravez de los caracteres de la cadena
		 
		char[] letterArray=cad.toCharArray();//convierte una cadena en un vector de caracteres
		
		for(Character c: letterArray)		//Navega en el vector buscando letras a
		{
			if(Character.toUpperCase(c)=='A')	//compara si es =A y si si lo mete a la pila
			{
				letters.push(c);
			}
		}
		while(!letters.isEmpty())		//Pregunta si esta vacio... miengtras letters is not empty
		{
			System.out.println(letters.pop());
		}
		/*for (Character c: letters)
		{
			System.out.println();
		}*/

	}

}
