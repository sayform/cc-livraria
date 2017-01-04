package livraria;

public class CarrinhoDeCompras {
	
	public double total;
	
	public void Adiciona(Livro livro) {
		System.out.println("Livro Adcionado: " + livro);
		livro.aplicarDesconto(0.05);
		total += livro.getValor();
	}
	
	public double getTotal() {
		return total;
	}

}
