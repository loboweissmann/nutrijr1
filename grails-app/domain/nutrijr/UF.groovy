package nutrijr

class UF {

	String nome
	String sigla

    static constraints = {
    	nome nullable:false, blank:false, unique:true, maxSize:32
    	sigla nullable:false, blank:false, unique:true, maxSize: 2, minSize:2
    }
}
