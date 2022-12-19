package machine

fun remaining(kava: Coffee){
    println(
        """
        The coffee machine has:
        ${kava.water} ml of water
        ${kava.milk} ml of milk
        ${kava.beans} g of coffee beans
        ${kava.cups} disposable cups
        $${kava.money} of money
    """.trimIndent()
    )
}