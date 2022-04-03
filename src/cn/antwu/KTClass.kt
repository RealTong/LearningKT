package cn.antwu

// Kotlin Class
open class TestKTClass(var height: Double, var lenght: Double) {
    var perimter = (height + lenght) * 2
}

// 默认都是final的  如果需要一个类可以被继承需要成名为open   使用: 继承一个类
class TestKTClass1(var weight:Double) : TestKTClass(4.0,2.0) {
    fun aaa(){
        println("$weight --- $height --- $lenght")
    }
}

fun main() {
    var rechangle = TestKTClass1(80.0);
    println(rechangle.perimter)
    rechangle.aaa()
}