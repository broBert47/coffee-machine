package machine


fun main() {
    val kava = Coffee(400, 540, 120, 9, 550)

    do {
        println("Write action (buy, fill, take, remaining, exit):")
        val odabir = readln()
        println()
        when (odabir) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                    when (readln()){
                        "1" -> {
                            if(kava.water < 250){
                                println("Sorry, not enough water!")
                            } else {
                                kava.water -= 250
                                kava.milk -= 0
                                kava.beans -= 16
                                kava.cups -= 1
                                kava.money += 4
                                println("I have enough resources, making you a coffee!")
                                println()
                            }
                        }

                        "2" -> {
                            if(kava.water < 350){
                                println("Sorry, not enough water!")
                            } else {
                                kava.water -= 350
                                kava.milk -= 75
                                kava.beans -= 20
                                kava.cups -= 1
                                kava.money += 7
                                println("I have enough resources, making you a coffee!")
                                println()
                            }
                        }

                        "3" -> {
                            if (kava.water < 200) {
                                println("Sorry, not enough water!")
                            } else {
                            kava.water -= 200
                            kava.milk -= 100
                            kava.beans -= 12
                            kava.cups -= 1
                            kava.money += 6
                            println("I have enough resources, making you a coffee!")
                            println()
                           }

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

data class Coffee (
    var water: Int,
    var milk: Int,
    var beans: Int,
    var cups: Int,
    var money: Int
    )
