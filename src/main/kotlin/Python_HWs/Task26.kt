package Python_HWs
// Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B с
// помощью рекурсии.
// A = 3; B = 5 -> 243 (3⁵)
//    A = 2; B = 3 -> 8

fun power(a: Int, b: Int): Int {
    return if (b == 0) 1
    else
        a * power(a, b - 1)
}

fun main() {
    println(power(3, 5))
}
