

public class Autor {

	private String nome;
	private String cpf;
	private String email;
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void imprimir() {
		System.out.println("Mostrando detahes do Autor");
		System.out.println("Nome: " + nome);
		System.out.println("e-mail: " + email);
		System.out.println("CPF: " + cpf);
		
	}
	
}
