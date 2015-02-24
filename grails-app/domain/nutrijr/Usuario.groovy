package nutrijr

class Usuario {

	String login
	String senha

    static constraints = {
    	login nullable:false, blank:false, unique:true, maxSize:32, minSize:8
    	senha nullable:false, blank:false, maxSize:16, minSize:4
    }
}
