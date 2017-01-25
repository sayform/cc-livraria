package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class MiniLivro extends Livro implements Promocional {

	public MiniLivro(Autor autor) {
		super(autor);
	}

	@Override
	public boolean aplicarDesconto(double porcentagem) {
		return false;
	}

}
