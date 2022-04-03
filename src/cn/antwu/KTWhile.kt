package cn.antwu

import java.io.InputStream

class KTWhile{

}
fun main() {
    val items = listOf("apple", "google", "facebook", "tesla")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    println(index)
}