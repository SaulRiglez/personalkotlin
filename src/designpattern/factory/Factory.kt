package designpattern.factory

fun catFactory(): Cat {
    return Cat()
}

/* 1.-
We will update this method to receive an Animal type
fun animalFactory(animalType: String) : Cat {
    return Cat()
}
*
*/


fun animalFactory(animalType: String) : Animal{
    return when(animalType.toLowerCase()) {
        "cat" -> Cat()
        "dog" -> Dog()
        else -> throw RuntimeException("Unknown animal $animalType")
    }

}