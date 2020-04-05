package designpattern.factory.cats

import designpattern.factory.Animal


class Cat(override val id: Int) : Animal {
    override val name: String
        get() = "Cat"
}