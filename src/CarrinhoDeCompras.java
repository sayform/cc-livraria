

public class CarrinhoDeCompras {
	
	public double total;
	
	public void Adiciona(Produto produto) {
		System.out.println("Livro Adcionado: " + produto);
		total += produto.getValor();
	}
	
	public double getTotal() {
		return total;
	}

}
