package com.exercise19stackandheaps.app;

import java.util.Stack;
public class StackandHeaps {

	public static void main(String[] args) {
		String cad="es, según la definición tradicional del término, el arte de organizar sensible y lógicamente una combinación coherente de sonidos y silencios respetando los principios fundamentales de la melodía, la armonía y el ritmo, mediante la intervención de complejos procesos psicoanímicos. El concepto de música ha ido evolucionando desde su origen en la Antigua Grecia, en que se reunía sin distinción a la poesía, la música y la danza como arte unitario.";
		
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
