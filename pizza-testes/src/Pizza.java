import java.util.HashMap;

public class Pizza {
	public HashMap<String, Integer> ingredientes = new HashMap<>();
	public static HashMap<String, Integer> totalIngrediente = new HashMap<>();
	
	void adicionaIngrediente(String ingrediente, int valor) {
		if (ingredientes.containsKey(ingrediente)) {
			valor += ingredientes.get(ingrediente);
			ingredientes.put(ingrediente, valor);
		} else {
			ingredientes.put(ingrediente, valor);
		}
		
		contabilizaIngrediente(ingrediente, valor);
	}

	int getPreco() {
		int size = ingredientes.size();
		if (size < 3) {
			return 15;
		}
		
		if (size > 5) {
			return 23;
		}
		
		return 20;

	}

	static void contabilizaIngrediente(String ingrediente, int valor) {
		if(totalIngrediente.containsKey(ingrediente)) {
			valor += totalIngrediente.get(ingrediente);
		}
		
		totalIngrediente.put(ingrediente, valor);
	}

	public int getContadorIngrediente() {
		return ingredientes.size();
	}

	static void zeraRegistroIngrediente() {
		 totalIngrediente.clear();
	}
	
}
