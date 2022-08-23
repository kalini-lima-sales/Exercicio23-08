class Cliente (

    var nome: String,
    var endereco: String,
    var telefone: String

    ) {

    private val listaDeCompras = mutableListOf<String>()

    init {

    }
    fun adicionar(produto: String) {
            if (produto.isNotBlank()) {
                listaDeCompras.add(produto)
                println("Produto adicionado!")
            } else {
                println("Oops, produto inválido! Por favor, tente novamente.")
            }
        }

    fun remover(produto: String) {
        if (listaDeCompras.contains(produto)){
            listaDeCompras.remove(produto)
            println("Produto removido.")
        }else{
            print("Oops, esse produto inexistente! Por favor, tente novamente.")
        }
    }

    fun apresentar() {
        listaDeCompras.forEach{
            println(it)
        }
    }
    }