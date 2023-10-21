package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	

	public void adicionar(Moeda Md, String tipo) {
		listaMoedas.add(Md);
			
	}
	public void remover(Moeda Md) {
		listaMoedas.remove(Md);
	}
	public void listagem() {
		for (Moeda Md : listaMoedas) {
			System.out.println(Md);
		}
	}
	public void totalConvertido(){
		double total = 0;
		for (Moeda i : listaMoedas) {
			total+= i.converter();
		}
		System.out.println("Valor total "
			+ "convertido em reais: " + "R$ " +String.format("%.2f", total));
			 
	}
	
}
