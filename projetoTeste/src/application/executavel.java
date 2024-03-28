package application;

import entities.Aluno;

public class executavel {

	public static void main(String[] args) {
		Aluno aluno = new Aluno ();
		
		aluno.setNome("João");
		aluno.setIdade(21);
		
		System.out.println("nome"+ aluno.getIdade()+","+ "idade"+ aluno.getIdade());
	}

}
