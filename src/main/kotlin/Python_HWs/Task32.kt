package Python_HWs

// Определить индексы элементов массива (списка), значения которых принадлежат заданному диапазону
// (т.е. не меньше заданного минимума и не больше заданного максимума)
fun main() {
    val list = (1..1000).toList()
    print("Initial element: ")
    val initial = readln().toInt()
    print("Last element: ")
    val last = readln().toInt()

    for (i in 0 until list.size) {
        if (list[i] in initial..last)
            print("$i ")
    }
}

