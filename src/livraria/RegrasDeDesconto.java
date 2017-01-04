package livraria;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new Livro(autor);
		livro.setValor(59.90);
		
		System.out.println("Valor atual: " + livro.getValor());
		
		if (!livro.aplicarDesconto(0.3)) {
			System.out.println("Desconto Máximo de 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if (!ebook.aplicarDesconto(0.15)) {
			System.out.println("Desconto máximo de 15%");
		} else {
			System.out.println("valor do Ebook com desconto" + ebook.getValor());
		}
		
	}
	
}
