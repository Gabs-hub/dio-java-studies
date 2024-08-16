package repeticao;

public class For {
	public static void main(String[] args) {
		int[] numeros = new int[6];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		
		for(int i: numeros) {
			System.out.println(i);
		}
		
		//Forma Alternativa
		/*for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}*/
	}
}
