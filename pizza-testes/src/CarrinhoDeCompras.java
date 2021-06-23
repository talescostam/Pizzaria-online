public class CarrinhoDeCompras {

  private int precoTotal = 0;
  
  public boolean adicionaPizza(Pizza pizza) throws Exception {
    if(pizza.getContadorIngrediente() < 1) {
      throw new Exception("N�o pode adicionar pizzas sem ingredientes.");
    } else {
      precoTotal += pizza.getPreco();
      return true;
    }
  }
  
  public int getPrecoTotal() {
    return precoTotal;
  }
  
}