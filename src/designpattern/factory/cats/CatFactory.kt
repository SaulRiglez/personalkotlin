package designpattern.factory.cats

import designpattern.factory.Animal

class CatFactory {

    fun createCat(breed: String, id: Int): Animal {
        return when (breed) {
            "persian" -> Persian(id)
            "mexican" -> Mexican(id)
            else -> throw RuntimeException("Unknown animal $breed")
        }
    }

}