package nutrijr

class Contrato {

	String numero
	double valor

	static belongsTo = [
		produto:Produto,
		cliente:Pessoa
	]

    static constraints = {
    }
}
