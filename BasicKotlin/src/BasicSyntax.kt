fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun maxOf1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun getLengthOfString(str: String): Int {
    return str.length
}

fun getLengthOfStringOpt(str: String?): Int {
    if (str != null) {
        return getLengthOfString(str)
    } else {
        return 0
    }
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a strinng"
            else -> "Unknown"
        }

fun main(args: Array<String>) {
    println("Hello, world!")
    println("sum1 : " + sum1(1, 2))
    println("sum2 : " + sum2(10, 20))
    printSum(-9, 3)

    var a = 1
    var s1 = "a is $a"
    a = 2
    var s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
    println()

    println("maxOf1(1, 2) is ${maxOf1(1, 2)}")
    println("maxOf2(1, 2) is ${maxOf2(1, 2)}")
    println()

    println("getLengthOfStringOpt('hello') = ${getLengthOfStringOpt("hello")}")
    println("getLengthOfStringOpt(null) = ${getLengthOfStringOpt(null)}")
    println()

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
    println()

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    println()

    println("describe(1) = ${describe(1)}")
    println("describe(\"Hello\") = ${describe("Hello")}")
    println("describe(3.2) = ${describe(3.1)}")
    println("describe(null) = ${describe("")}")
    println()

    for (x in 1..5) {
        print(x)
    }
    println()

    for (x in 1..10 step 2) {
        print(x)
    }
    println()

    for (x in 9 downTo 0) {
        print(x)
    }
    println()

    for (x in 9 downTo 0 step 3) {
        print(x)
    }
    println()
    println()

    for (item in items) {
        println(item)
    }
    println()

    var fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    println()

    // below properly works similarly with above.
    // I don't know the case to use which map or forEach
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .forEach { println(it.toUpperCase()) }



}