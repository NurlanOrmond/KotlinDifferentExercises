package Python_HWs

// Даны два неупорядоченных набора целых чисел (может быть, с повторениями). Выдать без повторений в порядке
// возрастания все те числа, которые встречаются в обоих наборах.
// Пользователь вводит 2 числа. n — кол-во элементов первого множества. m — кол-во элементов второго множества.
// Затем пользователь вводит сами элементы множеств.

fun main() {
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()
    var result = mutableListOf<Int>()

    println("Enter number of elements for first list:")
    val l1 = readln().toInt()
    println("Put elements to the first list:")
    repeat(l1) { list1.add(readln().toInt()) }

    println("Enter number of elements for second list:")
    val l2 = readln().toInt()
    println("Put elements to the second list:")
    repeat(l2) { list2.add(readln().toInt()) }

    for (i in 0 until l1) {
        for (j in 0 until l2) {
            if (list1[i] == list2[j]) {
                result.add(list1[i])
            }
        }
    }
    println(result.sorted())
}


