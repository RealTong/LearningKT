package cn.antwu

fun main() {
    incrTest()
//    variable()
//    variable1()
//    printSum(1, 2);

    // 模板字符串
//    println("2+3=${sum(2, 3)}")
//    println(sum(2, 3))

}

// Kotlin 方法
//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

// 简单写法
fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("$a+$b=${a + b}")
}

fun variable() {
    // val 有点像java的static?
    val a: Int = 1 //立即赋值
    val b = 2 //自动推断类型
    val c: Int //如果没有初始值类型不能忽略
    c = 3       //必须明确指定值
    println("a=$a b=$b c=$c")
//    c = 3 + 1       // 不能再次改变
    println("a=$a b=$b c=$c")
}

fun variable1() {
    var a = 5// 自动推断  int类型
    a += 1
    println("a=$a")
}

val PI = 3.1415926
var x = 5
fun incr() {
    x += 1
}

fun incrTest() {
    println("x=$x; PI=$PI")
    incr()
    println("incr()")
    println("x=$x; PI=$PI")
}