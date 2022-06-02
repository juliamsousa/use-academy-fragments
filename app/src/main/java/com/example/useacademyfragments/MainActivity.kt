package com.example.useacademyfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // acesso aos metodos de ciclo de vida do app

    /**
     * essas etapas de ciclo de vida sempre irão ocorrer, mesmo que não as declaremos
     *
     * o que temos de possibilidade é adicionar alguma funcionalidade
     * quando esses ciclos de vida forem executados
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * quando criamos o app devemos associar o layout a ele
         * por isso, esse método é chamado na criaçao do nosso componente
         *
         * o layout sempre é criado no onStart
         */
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()
    }
}