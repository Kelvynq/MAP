package modelo.bebidas;

public class vinho extends bebida {
	 private static final float preco = 20.0f;
	 private static final String quantidade = "900ml";
	    
	    @Override
		public String getTipo() {
			String tipo = "Vinho tinto";
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
		