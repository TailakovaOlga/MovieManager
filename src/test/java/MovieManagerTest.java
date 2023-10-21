package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void FindAllTest() {
        MovieManager manager = new MovieManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllOneTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперед");

        String[] actual = manager.findAll();
        String[] expected = {"Вперед"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");
        manager.addMovie("Тролли");

        String[] actual = manager.findAll();
        String[] expected = {"Вперед", "Джентельмены", "Тролли"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastBeginingTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");
        manager.addMovie("Тролли");
        String[] actual = manager.findLast();
        String[] expected = {"Тролли", "Джентельмены", "Вперед"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoreMaxLimit() { // В менеджере больше чем лимит
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");
        manager.addMovie("Тролли");
        manager.addMovie("Матрица");
        manager.addMovie("Вверх");
        manager.addMovie("Овод");
        manager.addMovie("Гладиатор");
        manager.addMovie("Терминатор");

        String[] actual = manager.findLast();
        String[] expected = {"Терминатор", "Гладиатор", "Овод", "Вверх", "Матрица"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllTestEqualsLimit() { //В менеджере равно лимиту
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");
        manager.addMovie("Тролли");
        manager.addMovie("Матрица");
        manager.addMovie("Вверх");

        String[] actual = manager.findAll();
        String[] expected = {"Вперед", "Джентельмены", "Тролли", "Матрица", "Вверх"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoreMinLimit() { //В менеджере меньше чем лимит
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");

        String[] actual = manager.findAll();
        String[] expected = {"Вперед", "Джентельмены"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
