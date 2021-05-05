package br.cicero.orientobjeto.Cores

open class Cor(

    val nome: String,
    val tonalidade: String) {


    open fun pintar() {

        println("Pintar")


    }

}