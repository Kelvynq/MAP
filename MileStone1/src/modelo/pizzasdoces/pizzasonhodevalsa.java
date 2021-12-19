package modelo.pizzasdoces;

public class pizzasonhodevalsa extends pizzadoce{
private static final float preco = 40.0f;
    

	@Override
	public String getSabor() {
		String servico = "Pizza de Sonho de valsa";
		return servico;
	}
	
	@Override
	public float getPreco() {
		return preco;
	}
}
