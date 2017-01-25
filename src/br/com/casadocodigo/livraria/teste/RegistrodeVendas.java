package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class RegistrodeVendas {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Maurício Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setTitulo("Test-Driven Development");
		fisico.setValor(59.90);
		
		if (fisico.aplicarDesconto10Porcento()){
			System.out.println("O valor do livro físico é: " + fisico.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setTitulo("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.Adiciona(fisico);
		cc.Adiciona(ebook);
		
		System.out.println("Valor Total " + cc.getTotal());
	}

}
