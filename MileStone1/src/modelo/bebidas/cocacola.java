package modelo.bebidas;

public class cocacola extends bebida{
	 private static final float preco = 10.0f;
	 private static final String quantidade = "350ml";
	    
	    @Override
		public String getTipo() {
			String tipo = "Refrigerante Coca-Cola";
			return tipo;
		}

		@Override
		public String getQuantidade() {
			return quantidade;
		}
		
		@Override
		public float getPreco() {
			return preco;
		}

	}