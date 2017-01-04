package livraria;

public class Ebook extends Livro {

	private String whaterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	public String getWhaterMark() {
		return whaterMark;
	}

	public void setWhaterMark(String whaterMark) {
		this.whaterMark = whaterMark;
	}
	
	// reescrevendo o método da superclasse Livro e aplicando o lógia dela através do SUPER
	@Override
	public boolean aplicarDesconto(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		} else {
			return super.aplicarDesconto(porcentagem);
		}
	}
}
