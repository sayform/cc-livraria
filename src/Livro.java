

public abstract class Livro implements Produto {
	private String titulo;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor) {
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
	public void imprimir() {
		System.out.println("Monstrando detalhes do livro:");
		System.out.println("Nome: " + titulo);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: R$ " + valor);
		System.out.println("ISBN: " + isbn);
		
		// mostra os detahes do autor apenas se ele exitir. 
		// A condiçõo vem do método temAutor(); que possui um boleno de retorno.
		if (this.temAutor()) {
			autor.imprimir();
			}
		System.out.println("----");
	}
	
}
