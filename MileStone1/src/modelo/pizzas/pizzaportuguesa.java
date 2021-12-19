package modelo.pizzas;

public class pizzaportuguesa extends pizza {
	 private static final float preco = 35.0f;
	    
	 @Override
		public String getSabor() {
			String sabor = "Pizza portuguesa";
			return sabor;
		}

		@Override
		public String getDescricao() {
			String descricao = "Mussarela, presunto, ovo, cebola, tomate, azeitona e orégano ";
			return descricao;
		}
		
		@Override
		public float getPreco() {
			return preco;
		}
	}
