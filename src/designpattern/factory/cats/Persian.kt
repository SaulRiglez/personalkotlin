package designpattern.factory.cats

import designpattern.factory.Animal

class Persian(override val id: Int) : Animal {
    override val name: kotlin.String
        get() = "Persian"
}
