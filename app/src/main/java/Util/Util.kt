package Util

import android.content.Context
import android.content.Intent

class Util {
    // Usamos 'companion object' para que la función sea llamada sin crear una instancia de Util
    companion object{
        // Función genérica para abrir cualquier Activity, siguiendo el modelo visto.
        fun openActivity(context: Context
                         , objClass: Class<*>){
            val intent= Intent(context
                , objClass)
            context.startActivity(intent)
        }
    }
}