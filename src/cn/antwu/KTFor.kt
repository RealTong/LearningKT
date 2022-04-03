package cn.antwu

/*
KT for 循环
 */
class KTFor {

}

fun main() {
    val items = listOf<String>("Apple", "Google", "Twitter", "CloudFlare")
    for (item in items) {
        println(item)
    }


    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    for ((index,item)in items.withIndex()){
        println("item at $item is ${items[index]}")
    }

    //  从上往下      步长2
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}