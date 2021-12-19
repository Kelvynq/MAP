package modelo.pizzas;

public class pizzafrango extends pizza {
	 private static final float preco = 30.0f;
	    
	 @Override
		public String getSabor() {
			String sabor = "Pizza de frango";
			return sabor;
		}

		@Override
		public String getDescricao() {
			String descricao = "Tomate, queijo, cebola, azeitona, orégano e frango";
			return descricao;
		}
		
		@Override
		public float getPreco() {
			return preco;
		}
	}
