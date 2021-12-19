package modelo.bebidas;

public class suco extends bebida{
	 private static final float preco = 8.0f;
	 private static final String quantidade = "500ml";
	 
	    @Override
		public String getTipo() {
			String tipo = "Suco de cajá";
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