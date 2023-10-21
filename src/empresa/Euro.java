package empresa;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}
	
	// MULTIPLICAR VALOR PARA CONVERSÃO EM REAL
	@Override
	public double converter() {
		double total = valor * 5.35;
		return total;
	}
	
	@Override
	public String toString() {
		return "Euro - valor: " + valor;
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
	public void info() {
		System.out.println("EUR" + String.format("%.2f", valor) +
				" foi adicionado");
			
		}
	
	

}
