package app.lucas.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "entrei no CREAT - criando a tela para você.")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "entrei no START - Deixei a tela visivel para você.")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "entrei no RESUME - Agora você pode interagir com a tela.")
    }
    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "entrei no PAUSE - A tela perdeu o foco. você não pode interagir.")
    }
    override fun onStop() {
        super.onStop()
        Log.w("lifecycle", "entrei no STOP - A tela não está mais disponível, mas ainde existe.")
    }
    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "entrei no RESTART - A tela está retomando o foco.")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle", "entrei no DESTROY - Oh não! A tela foi destruida.")
    }
}