package nutrijr

class PessoaJuridica extends Pessoa {
	
	String cnpj

	String toString() {
		"Jurídica ${this.nome}"
	}

	static constraints = {
		cnpj unique:true, blank:false, maxSize:128, nullable:false
	}

}