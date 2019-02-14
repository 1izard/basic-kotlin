fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun main(args: Array<String>) {
    println("Hello, world!")
    println("sum1 : " + sum1(1, 2))
    println("sum2 : " + sum2(10, 20))
    printSum(-9, 3)
}