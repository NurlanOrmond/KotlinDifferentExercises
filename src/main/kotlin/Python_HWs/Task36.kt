package Python_HWs

fun main() {
    print("Row: ")
    val row = readln().toInt()
    print("Colomn: ")
    val col = readln().toInt()

    printOperationTable(::table, row, col)
}

private fun printOperationTable (operation: (Int, Int) -> Unit, row: Int, col: Int) {
    operation(row, col)
}

private fun table(r: Int, c: Int) {
    var res = 0
    for (i in 1..r) {
        for (j in 1 .. c) {
            res = i * j
            if (res < 10) print("  ") else print(" ")
            print(res)
        }
        println()
    }
}