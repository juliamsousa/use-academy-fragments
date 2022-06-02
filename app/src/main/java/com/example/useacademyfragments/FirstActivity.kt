package com.example.useacademyfragments

// importacao da biblioteca que tem a AppCompactActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * para declarar que nossa classe é uma activity,
 * nossa classe deve herdar de AppCompactActivity
 */

/**
 * a pasta /res contem tudo aquilo que é referente a parte visual do app
 * os layouts, icones e afins
 */

/**
 * após criarmos uma activity devemos "avisar" o sistema para podermos utiliza-la
 * para isso mudamos as configs no manifest.xml
 *
 * no manifest podemos também colocar outras configs como permissoes e afins no manifest
 *
 * com a action de main dizemos que é a Activity principal, a primeira a ser aberta
 */

class FirstActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * para podermos acessar outros recursos no app utilizamos o R
         *
         * como dito anteriormente criamos o layout no ciclo de OnStart
         */

        setContentView(R.layout.activity_first)
    }
}