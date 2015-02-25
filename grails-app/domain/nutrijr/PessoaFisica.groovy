package nutrijr

class PessoaFisica extends Pessoa {
	
	String cpf
	String rg
	String sobrenome

	String toString() {
		"Fisica - ${this.nome}"
	}

	static constraints = {
		cpf unique:true, blank:false, maxSize:32
		rg  unique:true, blank:false, maxSize:32
		sobrenome maxSize:128, nullable:false, blank:false
	}

}