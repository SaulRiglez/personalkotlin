package designpattern.singleton

import java.util.concurrent.atomic.AtomicInteger


fun main(args: Array<String>) {

    for (i in 1..10) {
        println("Singleton Counter: " + Cat.incrementCounter())
    }
}

object Cat {
    private val counter = AtomicInteger(0)

    init {
        println("I was accessed for the first time")
    }

    fun incrementCounter() = counter.incrementAndGet()

}