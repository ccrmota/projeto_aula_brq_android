package br.cicero.orientobjeto.Model

open class Aluno(

    override val nome: String,
    override val sobrenome: String,
    override val idade: Int,
    override val email: String


) : Usuario(nome,sobrenome, idade, email) {

   open fun estudar() {
        println("$nome, estudando...")
    }


}