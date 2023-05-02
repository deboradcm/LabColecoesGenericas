import java.util.Calendar;
public class Aluno {
	String nome;
	int matricula, anoNascimento;
	
	Aluno(){
		nome = "Emmett L. Brown";
		matricula = 7714;
		anoNascimento = 22;
	}
	
	Aluno(String novoNome, int novaMatricula, int novoAnoNascimento){
		this.nome = novoNome;
		this.matricula = novaMatricula;
		this.anoNascimento = novoAnoNascimento;
		
	}
	
	public int getIdade() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		int idade = ano - anoNascimento;
		return (idade);
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public String getDescricao() {
		return (this.nome+" (mat="+this.matricula+", idade="+this.getIdade()+")");
	}

}
