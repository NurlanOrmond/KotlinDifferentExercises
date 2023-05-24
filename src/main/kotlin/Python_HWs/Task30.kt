package Python_HWs
// Заполните массив элементами арифметической прогрессии. Её первый элемент, разность и количество элементов
// нужно ввести с клавиатуры. Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
// Каждое число вводится с новой строки.
fun main() {
    print("Imput first element: ")
    val firstEl = readln().toInt()
    print("Input step: ")
    val step = readln().toInt()
    print("Input number of elements: ")
    val number = readln().toInt()

    val array = ArrayList<Int>(number)
    array.add(firstEl)
    var newEvement = firstEl
    for (i in 0..number) {
        array.add(newEvement + step)
        newEvement += step
    }
    println(array)

}