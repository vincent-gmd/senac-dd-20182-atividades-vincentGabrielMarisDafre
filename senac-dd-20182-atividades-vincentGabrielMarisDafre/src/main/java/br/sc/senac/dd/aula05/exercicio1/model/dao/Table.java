package br.sc.senac.dd.aula05.exercicio1.model.dao;

import java.util.ArrayList;

public class Table {
	String tableName;
	ArrayList<Coluna> colunas;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public ArrayList<Coluna> getColunas() {
		return colunas;
	}
	public void setColunas(ArrayList<Coluna> colunas) {
		this.colunas = colunas;
	}
}
