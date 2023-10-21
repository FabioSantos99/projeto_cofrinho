package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		
	    Cofrinho cofre = new Cofrinho();
		
	    // Identificação do Aluno
	    System.out.println("Nome Aluno: Fabio Santos Leite");
	    System.out.println("RU: 4383140"); 
	    //
	    
	    System.out.println("");
	    System.out.println("MENU");
	    System.out.println("------------");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Lista");
		System.out.println("3 - Remover");
		System.out.println("4 - Coverter total em Reais");
		System.out.println("0 - Encerrar" );
		opcao =teclado.nextInt();
		
		
		// MENU E SUB MENU uso de Switch case para a criação
		
		int tipoMd;
		double valor = 0;
		String nome;
		Moeda md = null;
		
		
		while(opcao!=0) { 
			switch(opcao) {
			
			case 1:
				// ADICIONAR
				tipoMd=0;
				while(tipoMd>3 || tipoMd<=0) {
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");
					tipoMd = teclado.nextInt();
				}
				System.out.println("Digite o valor: ");
				valor = teclado.nextDouble();
				
				md=null;
				
				if(tipoMd==1) {
					md = new Real(valor);
					md.info();
				}
				else if(tipoMd==2) {
					md = new Dolar(valor);
					md.info();

				}
				else {
					md = new Euro(valor);
					md.info();

				}
				cofre.adicionar(md, null);
				
				break;
				
			case 2:
				//LISTAR MOEDAS
				cofre.listagem();
				break;
				
			case 3:
				// REMOVER VALOR DE MOEDA
				tipoMd=0;
				while(tipoMd>3 || tipoMd<=0) {
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");
					tipoMd = teclado.nextInt();
				}
				System.out.println("Digite o valor: ");
				valor = teclado.nextDouble();
				
				md=null;
				if(tipoMd==1) {
					md = new Real(valor);
				}
				else if(tipoMd==2) {
					md = new Dolar(valor);
				}
				else {
					md = new Euro(valor);
				}
				
				cofre.remover(md);
				break;
				
				
			case 4:
				//CONVERTER TOTAL EM REAIS
				
				cofre.totalConvertido();
				
				
				break;
			default:
				System.out.println("Opcao invalida");	
					
			}
			
			/*
			 * REPETIR MENU ENQUANTO NÃO
			 *  FOR DIGITADO ZERO ENCERRAR
			 */
			
			System.out.println(" ");
			System.out.println("MENU");
			System.out.println("1 - Adicionar");
			System.out.println("2 - Lista");
			System.out.println("3 - Remover");
			System.out.println("4 - Coverter total em Reais");
			System.out.println("0 - Encerrar" );
			opcao =teclado.nextInt();
			
		}
		
	}
}
