package livraria;

public class RegistrodeVendas {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Maurício Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setTitulo("Test-Driven Development");
		
		Ebook ebook = new Ebook(autor);
		ebook.setTitulo("Test-Driven Development");
	}

}
