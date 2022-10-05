fun main() {

    /*
    Bir integer değişken oluşturun ve bu değişkende saniye değerini tutun.
    Sonra bu saniye değerinin kaç dakika ve saniyeye denk geldiğini yazdırın
    Örnek 1200 değeri için 20 dakika 0 saniye yazmalıdır.
    */

    convertSecond(1200)
    convertSecond(3884)

}

fun convertSecond(num: Int): Int {
    val hour = num / 3600
    val minute = (num / 60) % 60
    val second = (num % 60)
    println("$hour hour $minute minute $second second")
    return num
}