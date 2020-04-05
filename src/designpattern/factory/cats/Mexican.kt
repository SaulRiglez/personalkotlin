package designpattern.factory.cats

import designpattern.factory.Animal

class Mexican(override val id: Int) : Animal {

    override val name: kotlin.String
        get() = "Mexican"


}