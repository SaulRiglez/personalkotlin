package designpattern.factory.dogs

import designpattern.factory.Animal

class BullDog(override val id: Int) : Animal {
    override val name: String
        get() = "Cat"
}
