package ru.maxvagan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /** Функция получает на вход массив пар наименование Книги и ФИО автора.
     * Необходимо вернуть строки следующего формата:
     * "Наименование книги" Имя Отчество Фамилия (автора)
     * @param inpMassiv
     * @return Коллекция строк в виде Списка
     */
    private static List<String> ticketTask10(String[][] inpMassiv){
        List<String> result = new ArrayList<String>();
        result = Arrays.stream(inpMassiv).map(e -> String.join(" ", "\""+e[0]+"\"",
                e[1].split(" ")[1],
                e[1].split(" ")[2],
                e[1].split(" ")[0])).toList();
        return result;
    }

    public static void main(String[] args) {
        //Инициализируем массив строковых пар в качестве входных данных
        String[][] massiv = new String[][]{{"Book1", "Familia1 Imya1 Otchestvo1"},
                {"Book2", "Familia2 Imya2 Otchestvo2"},
                {"Book3", "Familia3 Imya3 Otchestvo3"},
                {"Book4", "Familia4 Imya4 Otchestvo4"},
                {"Book5", "Familia5 Imya5 Otchestvo5"}};
        //Выводим в консоль построчно результат работы метода (по условию задания)
        for (String row : ticketTask10(massiv)){
            System.out.println(row);
        }
        System.out.println(ticketTask10(massiv));
    }
}
