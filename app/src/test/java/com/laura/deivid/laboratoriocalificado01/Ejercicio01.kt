package com.laura.deivid.laboratoriocalificado01

import org.junit.Test

class Ejercicio01 {
    //Etiqueta test para la ejecución.
    @Test
    // Función principal para probar el código
    fun main() {
        // declaramos la variable Palabra(String) como parametro para la funcion Contarfrecuencia.
        val palabra = "hello"
        // declaramos resultado que va almacenar lo que retorne la funcion.
        val resultado = ContarFrecuencia(palabra)
        // Imprimir el resultado y la palabra
        println(palabra)
        println(resultado)
    }
    // Función para contar la frecuencia de cada character en una palabra
    private fun ContarFrecuencia(palabra: String): Map<Char, Int> {
        // Creamos un mapa mutable para almacenar la frecuencia de cada character.
        val frecuenciaMap = mutableMapOf<Char, Int>()

        // Recorremos cada character de la palabra
        for (character in palabra) {
            // Si el character ya está en el mapa, incrementamos su frecuencia en 1
            if (frecuenciaMap.containsKey(character)) {
                frecuenciaMap[character] = frecuenciaMap[character]!! + 1
            } else {
                // Si el character no está en el mapa, lo añadimos con frecuencia 1
                frecuenciaMap[character] = 1
            }
        }

        // Retornamos el mapa con la frecuencia de cada character
        return frecuenciaMap
    }

}