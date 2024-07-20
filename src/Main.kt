//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TODO 1. Дан список целых чисел. Необходимо найти сумму его элементов
    // начиная с 3 заканчивая 9.
    println("1. Задание\n")

    val listNumberOne = listOf(
        554, 126, 293, 830, 510, 194, 651, 631, 288, 146, 848, 756, 712
    )

    val sumListOne = listNumberOne.foldIndexed(0) { id, sum, element ->
        if (id in 2..8) sum + element else sum
    }

    println(sumListOne)

    getLine("=")

    //TODO 2. Дан список целых чисел. С помощью функции fold вывести элементы
    // этой коллекции в строку. Т.е. входной список: val numbers = listOf(1, 2, 3, 4).
    // Выходные данные: 1234
    println("2. Задание\n")

    val listToStroke = listNumberOne.fold("Выходные данные: ") { a, b ->
        "$a$b"
    }

    println(listToStroke)

    getLine("=")

    //TODO 3. Создать data класс Player, который характеризует игрока с именем,
    // количеством заработанных очков и выигранных денег. Создать список таких
    // игроков с произвольными данными в конструкторе. Посчитать и вывести в консоль
    // общее количество очков и выигранных денег.
    println("3. Задание\n")

    val player = listOf(
        Player("Александр", 1000000, 500),
        Player("Полина", 2000000, 1300),
        Player("Роман", 500000, 300),
        Player("Мария", 800000, 450)
    )

    val pointSum = player.sumOf { it.points }

    println("Общее количество очков у игроков: $pointSum")

    getLine("_")

    val moneyWonSum = player.sumOf { it.MoneyWon }

    println("Общее количество, выигранных игроками, денег: $moneyWonSum")

    getLine("=")

    //TODO 4. Дан список фруктов. Необходимо сгруппировать элементы этого списка по
    // первому символу с таким расчетом, чтобы в группу входили только фрукты с четной
    // длиной строки каждого элемента. Т.е. входной список такой:
    // val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос",
    // "яблоко"). Выходной результат:
    // {я=[Яблоко, яблоко], а=[], б=[], в=[Виноград], к=[]}
    println("4. Задание\n")

    val fruits = listOf(
        "Яблоко",
        "Абрикос",
        "Банан",
        "Виноград",
        "Вишня",
        "Кокос",
        "яблоко"
    )
    val groupFruits = fruits.groupBy { it.first().lowercase() }.mapValues { it.value.filter { it.length % 2 == 0 } }

    println(groupFruits)


    getLine("^")
}