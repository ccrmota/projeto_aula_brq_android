package br.cicero.orientobjeto.Model

open class Funcionarios(

    override val nome: String



) : Usuario(nome = "Cicero", sobrenome = "mota", idade = 34, email = "ccrismota@gamil.com"){


    open fun trabalhar(){

         println("Funcionario trabalhando....")

     }



}