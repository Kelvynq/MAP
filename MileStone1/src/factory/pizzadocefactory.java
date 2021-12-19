package factory;

import modelo.pizzasdoces.*;

public class pizzadocefactory {
	
	public static pizzadoce orderPizzaDoce(String nome) {
		pizzadoce pizzadoce = null;
		switch(nome) {
		case "doce de leite": pizzadoce = new pizzadocedeleite(); break;
		case "chocolate": pizzadoce = new pizzachocolate(); break;
		case "sonho de valsa": pizzadoce = new pizzasonhodevalsa();break;
		default: System.out.println("Opção inválida");
		}
		
		pizzadoce.getSabor();
		pizzadoce.getPreco();
		return pizzadoce;
	}
}
