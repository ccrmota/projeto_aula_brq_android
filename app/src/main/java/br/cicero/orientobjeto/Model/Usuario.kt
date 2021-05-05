package br.cicero.orientobjeto.Model


open class Usuario(
    open val nome: String,
    open val sobrenome: String,
    open val idade: Int,
    open val email: String

) {

    open fun fazer() {

        println("Usuario correndo...")

    }

    open fun ter() {

        println("Usuario tendo problemas...")

    }


}



