package br.sc.senac.dd.aula6.exercicio4.model.vo;

/**
 * Classe criada na disciplina de POO (2018/1)
 * 
 * Representa um Value Object (VO) de um Colecionador
 * 
 * @author Adriano de Melo
 * 
 */
public class FuncionarioVO {
	
	private int idFuncionario;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	
	public FuncionarioVO(int idColecionador, String nome, String cpf, String telefone, String email) {
		super();
		this.idFuncionario = idColecionador;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}
	
	public FuncionarioVO() {
		super();
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void imprimir(){
		System.out.printf("%3d   %-20s   %-15s   %-12s   %-20s \n", 
		this.getIdFuncionario(), 
		this.getNome(), 
		this.getCpf(), 
		this.getTelefone(), 
		this.getEmail());
	}
	
}
