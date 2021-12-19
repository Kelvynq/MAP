package pizzaria;
import factory.*;
import modelo.pizzas.*;
import modelo.bebidas.*;
import modelo.pizzasdoces.*;

public class Cliente {

	 static int quantpizza=2, quantpizzado=1, quantbebida=4;

	public static void main(String[] args) {
		
		System.out.println("=====PEDIDO====");
		System.out.println("\nPizza salgada");
		pizza pizza = pizzafactory.orderPizza("calabresa");
		System.out.printf("->Sabor: %s\nDescrição: %s\nPreço: R$%.2f\nUnidade: %d\n", pizza.getSabor(), pizza.getDescricao(), pizza.getPreco(), quantpizza);
		System.out.println("\nBebida");
		bebida bebida = bebidafactory.orderBebida("suco");
		System.out.printf("->Tipo de bebida: %s\nQuantidade(ML): %s\nPreço: R$%.2f\nUnidade: %d\n", bebida.getTipo(), bebida.getQuantidade(), bebida.getPreco(), quantbebida);
		pizzadoce pizzadoce = pizzadocefactory.orderPizzaDoce("sonho de valsa");
		System.out.println("\nPizza doce");
		System.out.printf("->Sabor: %s\nPreço: R$%.2f\nUnidade: %d\n", pizzadoce.getSabor(), pizzadoce.getPreco(), quantpizzado);
		System.out.printf("TOTAL: %.2f", (quantbebida*bebida.getPreco())+(quantpizza*pizza.getPreco())+(quantpizzado*pizzadoce.getPreco()));
	}
}
