package modelo.pizzas;

public class pizzabacon extends pizza{
	 private static final float preco = 40.0f;
	    
	 @Override
		public String getSabor() {
			String sabor = "Pizza de bacon";
			return sabor;
		}

		@Override
		public String getDescricao() {
			String descricao = "Bacon, queijo, cebola, tomate, azeitona e orégano";
			return descricao;
		}
		
		@Override
		public float getPreco() {
			return preco;
		}
	}


	