package visibilidade.lanchonete;

import visibilidade.lanchonete.area.cliente.Cliente;
import visibilidade.lanchonete.atendimento.Atendente;
import visibilidade.lanchonete.atendimento.cozinha.Almoxarife;
import visibilidade.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		// ações que não precisam estarem disponíveis para toda a aplicação
//		cozinheiro.lavarIngredientes();
//		cozinheiro.baterVitaminaLiquidificador();
//		cozinheiro.selecionarIngredientesVitamina();
//		cozinheiro.prepararLanche();
//		cozinheiro.prepararVitamina();
//		cozinheiro.prepararVitamina();

		// ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		Almoxarife almoxarife = new Almoxarife();
		// ações que não precisam estarem disponíveis para toda a aplicação
//		almoxarife.controlarEntrada();
//		almoxarife.controlarSaida();
		// ação que somente o seu pacote cozinha precisa conhecer (default)
//		almoxarife.entregarIngredientes();
//		almoxarife.trocarGas();

		Atendente atendente = new Atendente();
//		atendente.pegarLancheCozinha();
		atendente.servindoMesa();
		atendente.receberPagamento();
		// ação que somente o seu pacote cozinha precisa conhecer (default)
//		atendente.trocarGas();

		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

		// esta ação é muito sigilosa, qua tal ser privada ?
//		cliente.consultarSaldoAplicativo();

		// já pensou os clientes ouvindo que o gás acabou ?
//		cozinheiro.pedirParaTrocarGas(atendente);
//		cozinheiro.pedirParaTrocarGas(almoxarife);

	}
}
