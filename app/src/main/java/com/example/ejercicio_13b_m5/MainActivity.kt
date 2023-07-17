package com.example.ejercicio_13b_m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

data class Heroe(val superHero:String,val publisher:String,val realName:String, val photo:String)

fun main( ) {
    var i = 0
    println("Ingrese Cantidad")
    var cant = readln()

    var heroes = mutableListOf<Heroe>()

    do {

        println("Escribe el nombre")
        var nombre = readln()
        println("Publisher")
        var publisher = readln()
        println("Real Name")
        var realName = readln()
        println("Photo")
        var photo = readln()

        heroes.add(Heroe(nombre, publisher, realName, photo))
        i++
    } while (i > cant)
    for (h in heroes) {
        println(h)
    }
}