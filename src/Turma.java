import java.util.ArrayList;
//import java.util.Arrays;

public class Turma {
	int semestre, ano;
	String disciplina;
	Professor professor;
	ArrayList<Aluno> alunos;
	
	Turma (String novaDisciplina, int novoAno, int novoSemestre, Professor novoProfessor){
		this.disciplina = novaDisciplina;
		this.semestre = novoSemestre;
		this.ano = novoAno;
		this.professor = novoProfessor;
		this.alunos = new ArrayList<>();
	}
	
	void addAluno (Aluno novoAluno) {
		if( this.getAluno(novoAluno.matricula) != novoAluno ){
			this.alunos.add(novoAluno);

		}
	}
	
	
	public Aluno getAluno(int novaMatricula) {
		for (var i = 0; i < this.alunos.size(); i++) {
			if(this.alunos.get(i).matricula == novaMatricula) {
				return this.alunos.get(i);
			}
		}
		return null;
			
	}
	
	
double getMediaIdade() {
		double media = 0.0;
		for(var i = 0; i < this.alunos.size(); i++) {
			
			media = media + this.alunos.get(i).getIdade();
		}
		return media/this.alunos.size();
	}

	
	String getDescricao() {
		String descricao = "";
		String aluno = "";
		for (var i = this.alunos.size(); i > 0 ; i--) {
			aluno = "[NL]   - Aluno "+(((i-1)+1)+": "+this.alunos.get(i-1).getDescricao() +" "+aluno);
			descricao = ("Turma "+this.disciplina+" - "+this.ano+"/"+this.semestre+" ("+this.professor.getDescricao()+"): "+aluno);
			
			
	
		}
		return(descricao);
		
	}
	

}
