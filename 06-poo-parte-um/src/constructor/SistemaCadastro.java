package constructor;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("06724506716", "MARCOS SILVA");

		marcos.setEndereco("RUA DAS MARIAS");

		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
