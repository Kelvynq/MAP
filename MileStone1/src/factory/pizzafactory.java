package factory;
import modelo.pizzas.*;

public class pizzafactory {
    
	public static pizza orderPizza(String nome) {
		pizza pizza = null;
		switch(nome) {
		case "calabresa": pizza = new pizzacalabresa(); break;
		case "frango": pizza = new pizzafrango(); break;
		case "portuguesa": pizza = new pizzaportuguesa();break;
		case "bacon": pizza = new pizzabacon(); break;
		default: System.out.println("Opção inválida");
		}
		
		pizza.getSabor();
		pizza.getDescricao();
		pizza.getPreco();
		return pizza;
	}
}
