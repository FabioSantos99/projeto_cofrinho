package empresa;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}
	
	// MULTIPLICAR VALOR PARA CONVERSÃO EM REAL
	@Override 
	public double converter() {
		double total = valor * 4.85;
		return total;

	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Dolar - valor: " + valor;
	}


	@Override
	public void info() {
		
			System.out.println("USD " + String.format("%.2f", valor) +
				" foi adicionado");
				/*
				 * String.format("%.2f", valor) - formula 
				 * usada para usar apenas duas casas dos numeros
				 * racionais.
				 */
			}

	}



