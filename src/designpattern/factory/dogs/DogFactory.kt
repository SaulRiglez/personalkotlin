package designpattern.factory.dogs

import designpattern.factory.Animal

class DogFactory {
    fun createDog(breed: String, id: Int): Animal {
        return when (breed) {
            "beagle" -> Beagle(id)
            "bulldog" -> BullDog(id)
            else -> throw RuntimeException("Unknown animal $breed")
        }
    }
}