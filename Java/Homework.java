

import java.util.*;


public class Homework {

    /**
     * Дан текст. Нужно отсортировать слова по длине (по возрастанию) и вывести статистику на экран.
     * Регистр слова не имеет значения. Формат вывода произвольный.
     * Программа-минимум:
     * 1. Слова, состоящие из дефисов, считаем одним словом. Т.е. каких-то - одно слово из 8 символов.
     * 2. Точки и запятые не должны входить в статистику.
     *
     * Доп. задание
     * 1. * Не включать дефис в длину слова. Т.е. каких-то - одно слово из 7 символов.
     *
     * Пример:
     *
     * Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB.
     * Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.
     *
     * 1 -> [и, в]
     * 2 -> [он, из, gb, не]
     * 3 -> [мой, для]
     * 4 -> [слов, того, себе]
     * 5 -> [текст, нужен, чтобы, несет, набор]
     * ...
     */
    static void printStats(String text)
    {
        // 1. Split текста, приведение его к нижнему регистру, удаление запятых и точек.
        text = text.replaceAll("[,.]", "");
        text = text.toLowerCase();
        String[] words = text.split(" ");
        // 2. Сбор структуры со статистикой.
        Map<Integer, List<String>> stats = new HashMap<>(); // Структура, в которой ключ - длина слова, значение - список таких слов.
        for (String word : words)
        {
            List buf = new ArrayList();
            if (stats.containsKey(word.length()))
            {
                for(String i : stats.get(word.length()))
                {
                    buf.add(i);
                }
                buf.add(word);
                stats.put(word.length(), buf);
            }
            else
            {
                buf.add(word);
                stats.put(word.length(), buf);
            }
        }
        System.out.println(stats);
    }
    static void printStatsZvezd(String text)
    {
        // 1. Split текста, приведение его к нижнему регистру, удаление запятых и точек.
        text = text.replaceAll("[,.]", "");
        text = text.toLowerCase();
        String[] words = text.split(" ");
        // 2. Сбор структуры со статистикой.
        Map<Integer, List<String>> stats = new HashMap<>(); // Структура, в которой ключ - длина слова, значение - список таких слов.
        for (String word : words)
        {
            List buf = new ArrayList();
            String wordBuf = word.replaceAll("[-]", "");
            if (stats.containsKey(wordBuf.length()))
            {
                for(String i : stats.get(wordBuf.length()))
                {
                    buf.add(i);
                }
                buf.add(word);
                stats.put(wordBuf.length(), buf);
            }
            else
            {
                buf.add(word);
                stats.put(wordBuf.length(), buf);
            }
        }
        System.out.println(stats);
    }

    public static void main(String[] args) {
        String text = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. " +
                "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";

        printStats(text);
        printStatsZvezd(text);
    }
}
