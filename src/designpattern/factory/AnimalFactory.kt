package designpattern.factory

import designpattern.factory.cats.CatFactory
import designpattern.factory.dogs.DogFactory


class AnimalFactory {
    var counter: Int = 0
    val dogFactory = DogFactory()
    val catFactory = CatFactory()
    fun animalFactory(animalType: String, breed: String): Animal {
        return when (animalType.trim().toLowerCase()) {
            "cat" -> catFactory.createCat(breed, counter++)
            "dog" -> dogFactory.createDog(breed, counter++)
            else -> throw RuntimeException("Unknown animal $animalType")
        }
    }
}