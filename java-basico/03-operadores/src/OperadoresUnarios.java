
public class OperadoresUnarios {
	public static void main(String[] args) {
		
		int numero = 5;
		numero++;
		System.out.println(numero);

		// incrementando numero em mais 1 numero, imprime 6
		System.out.println(numero++);

		System.out.println(numero);

		// imprime 7, incrementa em mais 1
		System.out.println(++numero);

		boolean verdadeiro = true;

		System.out.println("Inverteu " + !verdadeiro);
		
	}
}
