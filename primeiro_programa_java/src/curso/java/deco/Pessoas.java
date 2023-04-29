package curso.java.deco;

public class Pessoas {
	
	private String Nome;
	 
	private String Sobrenome;
	
	private int idade;
	
	private int Cidade;
	
	private int Cor; 

	public String getNome() {
		return Nome;			
 }
	public int getCidade() {
		return Cidade;			
}
    public void setCidade(int cidade) {
		Cidade = cidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;

    
	}
	 
	 
	

}




