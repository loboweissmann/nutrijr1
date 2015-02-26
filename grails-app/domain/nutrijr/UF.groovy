package nutrijr

class UF {

	String nome
	String sigla

	static hasMany = [cidades:Municipio]

	String toString() {
		"${this.nome} (${this.sigla})"
	}

    static constraints = {
    	nome nullable:false, blank:false, unique:true, maxSize:32
    	sigla nullable:false, blank:false, unique:true, maxSize: 2, minSize:2
    }

    static mapping = {
    	cidades fetch:'select', lazy:false
    	cache true
    }
}
