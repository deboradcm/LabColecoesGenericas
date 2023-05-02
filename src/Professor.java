
public class Professor {
	String titulacao, nome;
	int matricula;
	
	Professor(){
		titulacao = "Dr";
		nome = "Hubert J. Farnsworth";
		matricula = 2208;
	}
	
	Professor(String novaTitulacao, String novoNome, int novaMatricula){
		this.titulacao = novaTitulacao;
		this.nome = novoNome;
		this.matricula = novaMatricula;
		
	}
	
	public String getDescricao() {
		return ("Prof. "+this.titulacao+" "+this.nome+" - mat "+this.matricula);
	}

}
