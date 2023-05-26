import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
    In this challenge, you are required to calculate and print the sum of the elements in an array,
    keeping in mind that some of those integers may be quite large.

    =Function Description=
    Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
    aVeryBigSum has the following parameter(s):
    int ar[n]: an array of integers .

    =Return=
    long: the sum of all array elements

    =Input Format=
    The first line of the input consists of an integer .
    The next line contains  space-separated integers contained in the array.

    =Output Format=
    Return the integer sum of the elements in the array.

 */


/*
 * Complete the 'aVeryBigSum' function below.
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
 */


/*

= 1.Yol =
fun aVeryBigSum(ar: Array<Long>): Long {
    var sum: Long = 0
    for (item in ar) {
        sum += item
    }
    return sum
}

 */


/*
= 2.Yol =
fun aVeryBigSum(ar: Array<Long>): Long {
    var sum: Long = 0
    ar.forEach {
        sum = (sum + it)
    }
    return sum
}
 */

// = 3.Yol =
fun aVeryBigSum(ar: Array<Long>): Long = ar.sum()


fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}





