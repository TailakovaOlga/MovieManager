package ru.netology.manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void FindAllTest(){
        MovieManager manager = new MovieManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test
    public void shouldFindAllOneTest(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперед");

        String[] actual = manager.findAll();
        String[] expected = {"Вперед"};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test
    public void shouldFindAllTest(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");
        manager.addMovie("Тролли");

        String[] actual = manager.findAll();
        String[] expected = {"Вперед","Джентельмены","Тролли"};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test
    public void shouldFindLastBeginingTest(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");
        manager.addMovie("Тролли");
        String[] actual = manager.findLast();
        String[] expected = {"Тролли","Джентельмены","Вперед"};

        Assertions.assertArrayEquals (expected, actual);
    }
}

