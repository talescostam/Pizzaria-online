
public class Principal {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("muçarela", 1);
		p1.adicionaIngrediente("presunto", 1);

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("muçarela", 1);
		p2.adicionaIngrediente("presunto", 1);
		p2.adicionaIngrediente("bacon", 1);

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("muçarela", 1);
		p3.adicionaIngrediente("presunto", 1);
		p3.adicionaIngrediente("bacon", 1);
		p3.adicionaIngrediente("ovo", 1);
		p3.adicionaIngrediente("calabresa", 1);
		p3.adicionaIngrediente("tomate", 1);

		CarrinhoDeCompras cdc = new CarrinhoDeCompras();

		try {
			cdc.adicionaPizza(p1);
			cdc.adicionaPizza(p2);
			cdc.adicionaPizza(p3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("O valor total das pizzas é: R$" + cdc.getPrecoTotal());

		System.out.println(Pizza.totalIngrediente);

	}
}
