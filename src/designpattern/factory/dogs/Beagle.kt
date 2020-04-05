package designpattern.factory.dogs

import designpattern.factory.Animal

class Beagle(override val id: Int) : Animal {
    override val name: String
        get() = "Beagle"
}

