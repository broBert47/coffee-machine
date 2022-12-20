package machine


fun main() {
    val kava = Coffee(400, 540, 120, 9, 550)

    do {
        println("Write action (buy, fill, take, remaining, exit):")
        val odabir = readln()
        println()
        when (odabir) {
            "buy" -> {
                var flag = true
                while (flag) {
                    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                    val unos = readln()
                    flag = false
                    when (unos) {
                        "1" -> kava.espresso()
                        "2" -> kava.latte()
                        "3" -> kava.cappuccino()
                        "back" -> {/* no-op */}
                        else -> flag = true
                    }
                }
            }


            "fill" -> {
                println("Write how many ml of water you want to add:")
                val addWater = readln().toInt()
                println("Write how many ml of milk you want to add:")
                val addMilk = readln().toInt()
                println("Write how many grams of coffee beans you want to add:")
                val addBeans = readln().toInt()
                println("Write how many disposable cups you want to add:")
                val addCups = readln().toInt()
                kava.water += addWater
                kava.milk += addMilk
                kava.beans += addBeans
                kava.cups += addCups
            }

            "take" -> {
                println("I gave you ${kava.money}")
                kava.money = 0
            }


            "remaining" -> {
                remaining(kava)
                println()
            }
        }

    } while (odabir != "exit")
}

data class Coffee(
    var water: Int,
    var milk: Int,
    var beans: Int,
    var cups: Int,
    var money: Int
) {

    fun espresso() {
        if (water < 250) {
            println("Sorry, not enough water!")
        } else {
            water -= 250
            milk -= 0
            beans -= 16
            cups -= 1
            money += 4
            println("I have enough resources, making you a coffee!")
            println()
        }
    }

    fun latte() {
        if (water < 350) {
            println("Sorry, not enough water!")
        } else {
            water -= 350
            milk -= 75
            beans -= 20
            cups -= 1
            money += 7
            println("I have enough resources, making you a coffee!")
            println()
        }
    }

    fun cappuccino() {
        if (water < 200) {
            println("Sorry, not enough water!")
        } else {
            water -= 200
            milk -= 100
            beans -= 12
            cups -= 1
            money += 6
            println("I have enough resources, making you a coffee!")
            println()
        }
    }
}
