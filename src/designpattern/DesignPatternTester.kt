package designpattern

import designpattern.factory.animalFactory
import designpattern.factory.catFactory

fun main(args: Array<String>) {
//val cat = catFactory()

    val  cat = animalFactory("cat")
    val dog = animalFactory("dog")

    println("Cat created: " + cat.name)
    println("Dog Created: " + dog.name)
}