package modelo.pizzas;

public class pizzacalabresa extends pizza {
    private static final float preco = 25.0f;
	
	@Override
	public String getSabor() {
		String sabor = "Pizza de calabresa";
		return sabor;
	}

	@Override
	public String getDescricao() {
		String descricao = "Cebola, queijo, tomate, azeitona, orégano e calabresa";
		return descricao;
	}
	
	@Override
	public float getPreco() {
		return preco;
	}
}
