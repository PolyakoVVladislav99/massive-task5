fun main() {
    println("Введите слова через пробел:")
    val words = readLine()?.split(" ")?.filter { it.isNotBlank() } ?: emptyList()

    if (words.isEmpty()) {
        println("Ошибка: Введен пустой массив слов.")
        return
    }

    val groupedWords = words.groupBy { it.toCharArray().sorted().joinToString("") }

    println("Сгруппированные слова:")
    groupedWords.values.forEach { group ->
        println(group.joinToString(", "))
    }
}
