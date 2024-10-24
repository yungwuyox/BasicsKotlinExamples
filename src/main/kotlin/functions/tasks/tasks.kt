package functions.tasks

fun main(){
 task3()
}

/*
Task1: Игра "Угадай число"

Задание: Напиши функцию, в которой компьютер пытается угадать число, загаданное пользователем от 1 до 1000. Пользователь должен давать подсказки "больше" или "меньше" после каждой попытки компьютера, пока компьютер не угадает правильно.
Подсказка: Используй цикл `while` для повторных попыток и условные операторы `if`/`else` для обработки подсказок пользователя.
*/
fun task1() {
    var low = 1
    var up = 1000
    var guessedNumber: Int
    var userResponse: String

    println("Загадайте число от $low до $up и я попробую его угадать !")
    userResponse = readLine()!!.toLowerCase()
    while (true) {
        guessedNumber = (low + up) / 2
        println("Я думаю, что ваше число $guessedNumber. Это верно? (введите + если 'да', > если 'больше' или < если 'меньше')")

        userResponse = readLine()!!.toLowerCase()

        if (userResponse == "+") {
            println("Ура! Я угадал ваше число!")
            break
        } else if (userResponse == ">") {
            low = guessedNumber + 1
        } else if (userResponse == "<") {
            up = guessedNumber - 1
        } else {
            println("Пожалуйста, введите + если 'да', > если 'больше' или < если 'меньше'.")
        }

        //есл границы пересек., аа-хахахахфывоыоврарпнгкеррагкрпооаоагкоаооо
        if (low > up) {
            println("Кажется, вы ошиблись с подсказками. Попробуйте еще раз!")
            break
        }
    }
}

/*
Task2: Сортировка списка с использованием функции высшего порядка

Задание: Напиши функцию, которая принимает список чисел и функцию-компаратор (лямбда-выражение). Используй эту функцию, чтобы отсортировать список по возрастанию и по убыванию. Выведи оба результата.
Подсказка: Используй функцию `sortedWith` и передавай лямбда-выражение для задания порядка сортировки.
*/
fun task2() {
    val numbers = listOf(2, 1, 6)
  // Сортирование по возрастанию
    var sortedAscending = numbers.sortedWith { a,b -> a.compareTo(b) }
    println("Сортировка по возрастанию: $sortedAscending")

    // Сортировка по убыванию
    val sortedDescending = numbers.sortedWith { a, b -> b.compareTo(a) }
    println("Сортировка по убыванию: $sortedDescending")
}



/*
Task3: Чётные и нечётные числа

Задание: Создай функцию, которая принимает список чисел и разделяет его на два списка: чётных и нечётных чисел. Используй условные операторы и лямбда-выражения. Выведи оба списка.
Подсказка: Используй функцию `filter` для разделения списка на чётные и нечётные числа.
*/
fun task3() {
    val numbers = listOf(5, 2, 9, 1, 4, 6, 7, 8, 122)
    val evenN = numbers.filter { it % 2 == 0 }
    val oddN = numbers.filter { it % 2 != 0 }
    println("Чётные числа: $evenN")
    println("Нечётные числа: $oddN")
}

/*
Task4: Подсчёт слов в строке

Задание: Напиши функцию, которая принимает строку и возвращает количество слов в этой строке. Проверь работу функции на нескольких строках, включая пустую строку и строку с пробелами.
*/



/*
Task5: Применение лямбда-выражений к списку строк

Задание: Создай список из нескольких строк. Используй функцию `map` и лямбда-выражение, чтобы преобразовать каждую строку в её обратный порядок символов. Выведи результат.
Подсказка: Используй метод `reversed` для обратного порядка символов в строке.
*/
fun task5() {

}

/*
Task6: Функция для нахождения среднего арифметического

Задание: Напиши функцию, которая принимает список чисел и возвращает их среднее арифметическое. Проверь работу функции на нескольких наборах данных.
Подсказка: Используй метод `sum` для нахождения суммы и раздели на количество элементов.
*/
fun task6() {
}

/*
Task7: Фильтрация списка по содержимому строки

Задание: Напиши функцию, которая принимает список строк и возвращает новый список, содержащий только строки, которые начинаются с заданной буквы. Используй функцию высшего порядка `filter`.
Подсказка: Используй метод `startsWith` в лямбда-выражении для фильтрации строк.
*/
fun task7() {
}

/*
Task8: Создание таблицы умножения

Задание: Напиши функцию, которая создает таблицу умножения для заданного числа и возвращает её в виде списка строк. Каждая строка должна быть вида "n * i = результат", где i меняется от 1 до 10.
Подсказка: Используй цикл `for` для создания строк таблицы.
*/
fun task8() {
}

/*
Task9: Проверка на наличие уникальных элементов

Задание: Напиши функцию, которая принимает список чисел и возвращает `true`, если все элементы списка уникальны, и `false` в противном случае.

*/
fun task9() {
}

/*
Task10: Функция для объединения и сортировки списков

Задание: Напиши функцию, которая принимает два списка чисел, объединяет их в один, удаляет дубликаты и возвращает отсортированный список. Проверь работу функции на разных наборах данных.
Подсказка: Используй функцию `union` для объединения списков и метод `sorted` для сортировки.
*/
fun task10() {
}

