package modelo.pizzasdoces;

public class pizzadocedeleite extends pizzadoce {
private static final float preco = 35.0f;

	@Override
	public String getSabor() {
		String servico = "Pizza de Doce de leite";
		return servico;
	}
	
	@Override
	public float getPreco() {
		return preco;
	}
}
