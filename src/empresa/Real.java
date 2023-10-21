package empresa;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
	}
	

	@Override
	public double converter() {
		return valor;
	
	}
	
	/*
	 *  toString para visualizar exatamente o 
	 *  que foi descrito pelo usuário ao roda
	 *  o código.
	 *  Usado também nas classes herdeiras Dolar e Euro.
	 */
	
	@Override
	public String toString() {
		return "Real - valor: " + valor;
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
	System.out.println("R$ " + String.format("%.2f", valor) +
			" foi adicionado");
		
	}
	
	
	

}
