fun main() {

    /*1. Crie uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
   nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
   A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
   Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção. Ao
   instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.*/

        try{

            print("Digite o seu nome: ")
            val nome = readln()

            print("Digite o endereço: ")
            val endereco = readln()

            print("Digite seu telefone: ")
            val telefone = readln()

            val cliente1 = Cliente(nome, endereco, telefone)

            while(true){

                println("1 - Adicionar produto")
                println("2 - Remover produto")
                println("3 - Exibir produtos")
                println("4 - Sair")

                print("Opções: ")
                val opc = readln().toInt()
                println()

                when(opc){

                    1 -> {
                        print("Digite o produto que deseja adicionar: ")
                        val produto = readln()
                        cliente1.adicionar(produto)
                    }
                    2 -> {
                        print("Digite o produto que deseja remover: ")
                        val produto = readln()
                        cliente1.remover(produto)
                    }
                    3 -> {
                        cliente1.apresentar()
                    }
                    4 -> break
                    else -> println("Opção inválida!")

                }

            }

        }catch (e: Exception){
            println(e.message)
        }

    }




