package org.example.oop.case1_ClassAndObjects.tasks

/*

    Создайте класс Car с полями brand (марка), model (модель) и year (год выпуска). Напишите функции:

    startEngine() — выводит сообщение о запуске двигателя.
    displayInfo() — выводит информацию об автомобиле (марка, модель, год выпуска).
    isVintage() — возвращает true, если автомобилю более 25 лет, иначе — false.

 */

// Класс, представляющий автомобиль
class Car(val brand: String, val model: String, val year: Int) {

    // Метод запуска двигателя
    // Выводит сообщение о запуске двигателя, добавляя марку и модель для персонализации.
    fun startEngine() {
        println("Двигатель автомобиля $brand $model запущен!")
    }

    // Метод отображения информации об автомобиле
    // Предоставляет полную информацию о машине (удобно для пользователя, чтобы видеть основные характеристики).
    fun displayInfo() {
        println("Марка: $brand, Модель: $model, Год выпуска: $year")
    }

    // Метод проверки на винтажность
    // Использует текущий год для вычисления возраста автомобиля.
    // Возвращает true, если возраст более 25 лет, что делает автомобиль "винтажным".
    fun isVintage(): Boolean {
        // Получаем текущий год через стандартную библиотеку
        val currentYear = 2024
        // Проверяем, старше ли автомобиль 25 лет
        return currentYear - year > 25
    }
}

// Точка входа в приложение
fun main() {
    // Создаем экземпляр класса Car
    // Задаем параметры для описания конкретного автомобиля
    val car = Car(brand = "Toyota", model = "Corolla", year = 1995)

    // Запускаем двигатель автомобиля
    // Демонстрация функциональности: запускаем двигатель и выводим сообщение.
    car.startEngine()

    // Выводим информацию об автомобиле
    // Информативный метод для получения данных о машине.
    car.displayInfo()

    // Проверяем, является ли автомобиль винтажным
    // Это интересная функциональность для оценки возраста автомобиля.
    if (car.isVintage()) {
        println("Автомобиль является винтажным.")
    } else {
        println("Автомобиль не является винтажным.")
    }
}
