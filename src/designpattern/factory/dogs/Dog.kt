package designpattern.factory.dogs

import designpattern.factory.Animal

open class Dog(override val id: Int) : Animal {
    override val name: String
        get() = "Dog"
}