package repeticao;

public class While {
	public static void main(String[] args) {
		int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        
        do {
            System.out.print(i + " ");
            i++;
        } while (i > 10 && i <= 20);
        
	}
}
