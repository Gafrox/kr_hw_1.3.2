fun main() {
    println(comission("Mastercard", 7000_00.0, 5000_00.0))
}

fun comission(typeCard: String = "Vk Pay", sumTransfer: Double = 0.0, currentTransfer: Double = 0.0): Double {
    var sumComission = 0.0
    val odds = 75000_00.0 - sumTransfer
    when (typeCard) {
        "Mastercard", "Maestro" -> sumComission = if (odds >= currentTransfer) 0.0 else currentTransfer * 0.006 + 20_00
        "Visa", "Мир" -> sumComission = if (currentTransfer * 0.0075 < 35_00) 3500.0 else currentTransfer * 0.0075
        "Vk Pay" -> sumComission = 0.0
    }
    return sumComission
}