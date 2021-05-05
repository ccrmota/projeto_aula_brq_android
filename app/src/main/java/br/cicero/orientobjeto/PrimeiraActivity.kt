package br.cicero.orientobjeto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.cicero.orientobjeto.Cores.Azul
import br.cicero.orientobjeto.Cores.Cor
import br.cicero.orientobjeto.Cores.Vermelho
import br.cicero.orientobjeto.Model.Aluno
import br.cicero.orientobjeto.Model.Funcionarios
import br.cicero.orientobjeto.Model.Usuario

class PrimeiraActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)



        val usuarioFuncionarios = Funcionarios(nome = "Adailton")
        val usuarioAluno = Aluno("Jose", sobrenome = "silva", idade = 28, email = "jose@gmail.com")

        val corVermelho = Vermelho()
        val corAzul = Azul()



        oqueFazUsuario(usuarioFuncionarios)
        oqueFazUsuario(usuarioAluno)

        pintarNaCor(corVermelho)
        pintarNaCor(corAzul)

    }

     fun oqueFazUsuario(usuario: Usuario) {

        println("O que faz o ${usuario.nome}")
    }
    fun pintarNaCor(cor: Cor) {

        println("cor ${cor.nome}")

    }
}