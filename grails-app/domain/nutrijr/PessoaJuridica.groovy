package nutrijr

class PessoaJuridica extends Pessoa {
	
	String cnpj

	static constraints = {
		cnpj unique:true, blank:false, maxSize:128, nullable:false
	}

}