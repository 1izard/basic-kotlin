fun devValFunc(a: Int = 2, b: String = "Hello") {
    println("a * 2 = ${a * 2}, $b, world")
}

fun transform1(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}

fun transform2(color: String): Int = when (color) {
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param value")
}


fun ifExpression(param: Int): String {
    return if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else{
        "three"
    }
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

fun main(args: Array<String>) {
    devValFunc()
    devValFunc(5)
    devValFunc(10, "Goodnight")
    println()

    val list = listOf(-2, -1, 0, 1, 2)
    val positiveList1 = list.filter { x -> x > 0 }
    val positiveList2 = list.filter { it > 0 }
    println("positiveList1 = $positiveList1")
    println("positiveList2 = $positiveList2")
    println()

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((k, v) in map) {
        println("$k -> $v")
    }
    println()

    println("transform1(\"Red\") = ${transform1("Red")}")
//    println(transform1("Yellow"))
    println()

    println("transform2(\"Blue\") = ${transform2("Blue")}")
    println()

    println("1 -> ${ifExpression(1)}")
    println()

    println("Array of minus one = ${arrayOfMinusOnes(5)}")
    print("Array of minus one = [ ")
    for (v in arrayOfMinusOnes(5)) {
        print("$v ")
    }
    println("]")
    println()
}