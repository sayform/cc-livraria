package livraria;

public class RegistrodeVendas {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Maurício Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setTitulo("Test-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setTitulo("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.Adiciona(fisico);
		cc.Adiciona(ebook);
		
		System.out.println("Valor Total " + cc.getTotal());
	}

}
