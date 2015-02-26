package nutrijr

class Usuario {
	String id
	String login
	String senha

    static constraints = {
    	login nullable:false, blank:false, unique:true, maxSize:32, minSize:8
    	senha nullable:false, blank:false, maxSize:16, minSize:4
    }

    static mapping = {
    	version false
    	table "nutri_usuario"
    	login column:'username', index:'IDX_NUTRICASH_USUARIO_USERNAME'
    	id generator:'uuid'
    }
}
