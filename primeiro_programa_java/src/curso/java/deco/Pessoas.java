package curso.java.deco;

import java.util.Date;

import org.graalvm.compiler.code.DataSection.Data;

public class Pessoas {
	
	private String Nome;
	 
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	private int Endereço;

	public int getEndereço() {
		return Endereço;
	}
	public void setEndereço(int endereço) {
		Endereço = endereço;
	}
	private String Sobrenome;
	
	private int idade;
	
	private int Cidade;
	
	private Date DataNascimento;
	
	private Date DataCadastro;
	
	private int Sexo; 

	private int Estado;
	
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}

	private int Escolaridade; 
	
	public int getEscolaridade() {
		return Escolaridade;
	}
	public void setEscolaridade(int escolaridade) {
		Escolaridade = escolaridade;
	}
	public int getSexo() {
		return Sexo;
	}
	public void setSexo(int sexo) {
		Sexo = sexo;
	}
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




