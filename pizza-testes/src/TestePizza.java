import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestePizza {

	@Test
	public void testValor2Ingredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("presunto", 1);
		p.adicionaIngrediente("bacon", 1);
		assertEquals(15, p.getPreco());
	}
	
	@Test
	public void testValor3Ingredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("muçarela", 1);
		p.adicionaIngrediente("presunto", 1);
		p.adicionaIngrediente("bacon", 1);
		assertEquals(20, p.getPreco());
	}
	
	@Test
	public void testValor6Ingredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("muçarela", 1);
		p.adicionaIngrediente("presunto", 1);
		p.adicionaIngrediente("bacon", 1);
		p.adicionaIngrediente("ovo", 1);
		p.adicionaIngrediente("calabresa", 1);
		p.adicionaIngrediente("tomate", 1);
		assertEquals(23, p.getPreco());
	}
	
	@Test
	public void testRegistroIngredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("muçarela", 1);

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("muçarela", 1);
		p2.adicionaIngrediente("bacon", 1);

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("muçarela", 1);
		p3.adicionaIngrediente("bacon", 1);
		p3.adicionaIngrediente("ovo", 1);
		assertEquals(Integer.valueOf(3),Pizza.totalIngrediente.get("muçarela"));
		assertEquals(Integer.valueOf(2),Pizza.totalIngrediente.get("bacon"));
		assertEquals(Integer.valueOf(1),Pizza.totalIngrediente.get("ovo"));
	}
	
	@After
	public void zerandoRegistro() {
		Pizza.zeraRegistroIngrediente();
	}
	
}
