import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompras {

	@Test
	public void testPrecoTotal() throws Exception {
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
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaPizza(p1);
		c.adicionaPizza(p2);
		c.adicionaPizza(p3);
		assertEquals(58, c.getPrecoTotal());
	}

	@Test(expected = Exception.class) 
	  public void testAdicionaSemIngredientes() throws Exception {
	    Pizza p = new Pizza();
	    CarrinhoDeCompras cdc = new CarrinhoDeCompras();
	    cdc.adicionaPizza(p);
	  }
		
}
