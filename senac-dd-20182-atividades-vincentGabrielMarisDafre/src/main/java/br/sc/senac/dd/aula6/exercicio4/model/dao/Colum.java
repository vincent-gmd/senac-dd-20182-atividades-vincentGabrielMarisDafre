package br.sc.senac.dd.aula6.exercicio4.model.dao;

public class Colum {
	private String type;
	private String name;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Colum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Colum(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	public String toString(){
		return name;
	}

}
