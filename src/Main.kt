import kotlin.random.Random

// задание 1
fun main() {
    val target = Random.nextInt(1, 100)
    println("угадай число (1-100)")
    while (true){
        print("введите число")
        val inp = readln().toInt()
        when {
            inp < target -> println("число больше")
            inp > target -> println("число меньше")
            else -> {
                println("угадал: $target")
                break
            }
        }
    }

    // задание 2
    println("введите строку:")
    val text = readLine() ?: ""

    val vowels = setOf('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
        'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я')

    val countV = text.count { it in vowels }

    println("количество гласных букв: $countV")

    // задание 3
    println("введите число")
    val input = readLine()
    val n = input?.toIntOrNull()

    if (n == null || n <= 0){
        println("введите положительное число")
        return
    }
    var k = n
    while (k >= 1){
        println(k)
        k--
    }

    // задание 4
    val length = Random.nextInt(8, 17)

    val upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val lower = "abcdefghijklmnopqrstuvwxyz"
    val digits = "0123456789"
    val spec = "!@#\$%^&*()_+-=[]{}|;:'\",.<>?/"

    val all = upper + lower + digits + spec

    val passwordC = StringBuilder()

    passwordC.append(upper.random())
    passwordC.append(lower.random())
    passwordC.append(digits.random())
    passwordC.append(spec.random())

    for (i in 4 until length) {
        passwordC.append(all.random())
    }

    val passwordList = passwordC.toList().shuffled()
    val password = passwordList.joinToString("")

    println("пароль: $password")

    // задание 5
    println("введите ваше имя:")
    val name = readLine() ?: ""

    println("ответьте на три вопроса:")

    println("вопрос 1: Сколько лет?")
    val answer1 = readLine() ?: ""

    println("вопрос 2: Любимая игра?")
    val answer2 = readLine() ?: ""

    println("вопрос 3: На чём кодишь?")
    val answer3 = readLine() ?: ""

    val reviews = arrayOf("Ты крутой!", "Хорошая работа!")

    val randomIndex = Random.nextInt(reviews.size)
    val review = reviews[randomIndex]

    println("\n--- результаты опроса ---")
    println("Имя: $name")
    println("ответы:")
    println("1. $answer1")
    println("2. $answer2")
    println("3. $answer3")
    println("Отзыв: $review")

    // Задание 6
    println("введите число N: ")
    val input1 = readLine()
    val N = input1?.toIntOrNull()

    if (N == null || N < 1) {
        println("введите положительное число")
        return
    }
    val sum = N * (N + 1) / 2

    println("сумма чисел от 1 до $N равна $sum")

    // задание 7
    println("10 бросков: ")

    repeat(10){
        val rol = Random.nextInt(1,7)
        println("бросок ${it + 1}. $rol")
    }

    // задание 8
    val s1 = Random.nextInt(0,6)
    val s2 = Random.nextInt(0,6)
    val s3 = Random.nextInt(0,6)

    println("$s1 | $s2 | $s3")

    if (s1 == s2 && s2 == s3){
        println("джекпот")
    }

    // заданеи 9
    var balance = Random.nextInt(100, 1001)
    println("начальный баланс: $balance рублей")

    var day = 1
    while (balance >= 10) {
        val withdrawal = Random.nextInt(10, 101)

        if (withdrawal > balance) {
            println("день $day: остаток $balance рублей, попытка снять $withdrawal рублей, вся сумма.")
            balance = 0
            println("день $day: остаток: $balance рублей")
            break
        } else {
            balance -= withdrawal
            println("день $day: снято $withdrawal рублей, остаток: $balance рублей")
        }
        day++
    }
    println("день $day: деньги закончились.")

    // задание 10
    val daysOfWeek = listOf("понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье")
    val temperatures = daysOfWeek.map { day ->
        day to Random.nextInt(-10, 31)
    }

    println("температуры по дням недели:")
    for ((day, temp) in temperatures) {
        println("$day: $temp°C")
    }
    println("\nдни с температурой ниже нуля:")
    temperatures.filter { it.second < 0 }.forEach { (day, temp) ->
        println("$day: $temp°C")
    }
}