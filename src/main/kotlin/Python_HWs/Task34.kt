package Python_HWs

// Задача 34:  Винни-Пух попросил Вас посмотреть, есть ли в его стихах ритм. Поскольку разобраться в его кричалках
// не настолько просто, насколько легко он их придумывает, Вам стоит написать программу. Винни-Пух считает, что ритм
// есть, если число слогов (т.е. число гласных букв) в каждой фразе стихотворения одинаковое. Фраза может состоять из
// одного слова, если во фразе несколько слов, то они разделяются дефисами. Фразы отделяются друг от друга пробелами.
// Стихотворение  Винни-Пух вбивает в программу с клавиатуры. В ответе напишите “Парам пам-пам”, если с ритмом все в
// порядке и “Пам парам”, если с ритмом все не в порядке
//
//*Пример:*
//**Ввод:** пара-ра-рам рам-пам-папам па-ра-па-да
//    **Вывод:** Парам пам-пам
fun main() {
    val inputStrting = readln()
    highFun(inputStrting, ::wordToInt)

}

private fun wordToInt (txt: String): MutableList<Int> {
    val words = txt.trim().split("\\s+".toRegex()).toList()
    val toNumber = mutableListOf<Int>()
    var count = 0
    for (word in words) {
        for (char in word) {
            if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' || char == 'y') {
                count += 1
            }
        }
        toNumber.add(count)
        count = 0
    }
    return toNumber
}

private fun highFun (str: String, myFun: (String) -> List<Int>) {
    var count = 0
    val list = myFun(str)
    for (element in list) {
        if (list[0] != element) {
            count +=1
        }
    }
    if (count == 0) println("Парам пам-пам") else println("Пам парам")
}