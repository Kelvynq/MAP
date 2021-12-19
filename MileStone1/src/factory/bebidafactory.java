package factory;
import modelo.bebidas.*;

public class bebidafactory {
	
	public static bebida orderBebida(String nome) {
		bebida bebida = null;
		switch(nome) {
		case "cocacola": bebida = new cocacola(); break;
		case "suco": bebida = new suco(); break;
		case "vinho": bebida = new vinho();break;
		default: System.out.println("Não existe no nosso cardápio");
		}
		
		bebida.getTipo();
		bebida.getQuantidade();
		bebida.getPreco();
		return bebida;
	}
}
