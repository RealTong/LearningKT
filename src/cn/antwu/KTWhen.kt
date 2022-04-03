package cn.antwu

/*
Kt when   (java switch)
 */
class KTWhen {

}
fun main(){
    val value = 10
    when(value){
        in 9..11-> {
            println(1)
        }
        2-> {
            println(2)
        }
        else-> {
            println("else")
        }
    }
}
