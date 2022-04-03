package cn.antwu

/*
Kotoin模板字符串
 */
class TemplateStr {
}

fun main() {
    var a = 1;
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")},but now is $a"
    println(s2)
}