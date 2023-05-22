package Python_HWs

fun main() {
    println(
        List(readln().toInt()) { readln().toInt() }.chunked(3){it.sum()}.max()
    )

}