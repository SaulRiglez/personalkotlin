package designpattern

import designpattern.factory.Animal
import designpattern.factory.AnimalFactory


fun main(args: Array<String>) {
    val listOfAnimal = listOf(
        "dog" to "beagle",
        "dog" to "bulldog",
        "cat" to "persian",
        "dog" to "bulldog",
        "cat" to "mexican",
        "dog" to "bulldog",
        "cat" to "persian",
        "cat" to "mexican"
    )
    val animalFactory = AnimalFactory()
    val animalStore = mutableListOf<Animal>()

    for ((animal, breed) in listOfAnimal) {
        animalStore.add(animalFactory.animalFactory(animal, breed))
    }

    println("Printing animals")
    animalStore.forEach { println("${it.id} - name: ${it.name}") }
}