package modelo.pizzasdoces;

public class pizzachocolate extends pizzadoce{
	private static final float preco = 30.0f;

	@Override
	public String getSabor() {
		String servico = "Pizza de Chocolate";
		return servico;
	}
	
	@Override
	public float getPreco() {
		return preco;
	}
}
