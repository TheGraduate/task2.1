
fun main() {
    println("Введите сумму для перевода")
    val amount = readLine()
    if (amount != null) {
        val commission = amount.toInt() * 0.75 / 100
        if (commission < 35 ) {
            println("коммиссия равна 35 рублям, остаток ")
        } else {
            println("коммиссия равна " + commission.toInt())
          }
    }
}
