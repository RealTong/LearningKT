package cn.antwu

/*
Kotlin 逻辑判断
 */
class KTIf {
}

fun main() {
    var a = 1
    var b = 2
    testKTIf(a,b)
}

fun testKTIf(a: Int, b: Int) {
    if (a > b) {
        println("a>b")
    } else {
        println("a<b")
    }
}