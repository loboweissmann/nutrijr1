package nutrijr

class Municipio {

	String nome

	static belongsTo = [estado:UF]

    static constraints = {
    	nome nullable:false, blank:false, maxSize:64, minSize:4
    	estado nullable:false, unique:'nome'
    }
}
