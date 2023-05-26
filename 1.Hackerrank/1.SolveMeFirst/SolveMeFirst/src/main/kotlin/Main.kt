import java.util.*

/*
    Complete the function solveMeFirst to compute the sum of two integers.
    Example.
    a=7
    b=3
    Return 10

    =Function Description=

    solveMeFirst has the following parameters:
    int a: the first value
    int b: the second value
    -Returns-
    int: the sum of a and b

      =Constraints=
      1 <=a,b <=100

-------------------------------------------------------------------------------------------------------------

fun solveMeFirst(a: Int, b: Int): Int {
    return a + b
}

 */

// fun solveMeFirst(a: Int, b: Int): Int = a + b
fun solveMeFirst(a: Int, b: Int) = a + b // Fonksiyonu bu şekilde en kısa hali ile yazabiliriz.


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}