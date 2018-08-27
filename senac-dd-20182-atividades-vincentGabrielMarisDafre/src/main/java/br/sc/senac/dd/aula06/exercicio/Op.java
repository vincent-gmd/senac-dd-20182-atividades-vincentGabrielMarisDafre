package br.sc.senac.dd.aula06.exercicio;

public enum Op {plus(1,"+"),minus(1,"-"),multiply(2,"*"),divide(2 ,"/"),equals(3,""),ce(3,"");
private int priority;
private String toString;
Op(int priority,String toString) {
    this.priority = priority;
    this.toString = toString;
}

public int getPriority() {
    return priority;
}
public String toString() {
	return toString;
}
}
