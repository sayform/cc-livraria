package br.com.casadocodigo.livraria.teste;


public class CalculadoreDeEstoque {
	public static void main(String[] args) {
		double livroTDD = 59.90;
		
		double soma = livroTDD + livroTDD;
		
		System.out.println("O total em estoque é: " + soma);
		
		if (soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else {
			System.out.println("Seu estoque está bom!q");
		}
		
	}
}
