fun main() {
    println("Введите сумму перевода в копейках для расчета комиссии: ")
    val amount = readln().toDouble()
    val percentCommission = 0.0075
    val minCommission = 3500.0
    var totalCommission = amount * percentCommission
    if (totalCommission < minCommission) {
        totalCommission = minCommission
    }
    print ("Комиссия составляет: $totalCommission коп.")
}