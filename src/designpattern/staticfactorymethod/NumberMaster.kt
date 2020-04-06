package designpattern.staticfactorymethod

class NumberMaster private constructor(){
    companion object {
        fun valueOf(hopefullyNumber: String): Long {
            return hopefullyNumber.toLong()
        }
    }
}