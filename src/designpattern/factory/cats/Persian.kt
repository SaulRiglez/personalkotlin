package designpattern.factory.cats

import designpattern.factory.Animal
import designpattern.factory.dogs.Dog

class Persian(override val id: Int) : Animal {
    override val name: kotlin.String
        get() = "Persian"
}
