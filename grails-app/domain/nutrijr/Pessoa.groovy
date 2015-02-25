package nutrijr

abstract class Pessoa {
	
	String nome
	String observacoes

	String toString() {
		this.nome
	}

	static belongsTo = [
		municipio:Municipio
	]

	static constraints = {
		nome nullable:false, blank:false, maxSize:128
		observacoes nullable:true, blank:true, maxSize:4096
		municipio nullable:false
	}

}