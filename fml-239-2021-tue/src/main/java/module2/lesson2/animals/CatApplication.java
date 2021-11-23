package module2.lesson2.animals;

import java.util.Scanner;

public class CatApplication {

    public static void main(String[] args) {

        AnimalRepository repository = new AnimalRepository();
        Scanner in = new Scanner(System.in);
        System.out.println("Вы в стране животных");
        System.out.println("Для просмотра списка команд, введите" +
                " -help");
        while (true) {
            String command = in.next();
            if (command.equals("-help")) {
                System.out.println("Посмотреть список животных - getAnimals");
                System.out.println("Найти животное по id - getAnimal");
                System.out.println("Добавить животное в базу данных - createAnimal");
                System.out.println("Поиграть с животным - game");
                System.out.println("Выход - quit");
            }
            if (command.equals("quit")) {
                System.out.println("До свидания!");
                break;
            }
            if (command.equals("getAnimals")) {
                System.out.println("Список животных:");
                repository.getAnimals()
                        .forEach(System.out::println);
            }
            if (command.equals("getAnimal")) {
                System.out.println("Введите id животного...");
                long id = in.nextLong();
                System.out.println("Животное " + id + ": " + repository.getAnimalById(id));
            }
            if (command.equals("createAnimal")) {
                System.out.println("Вы можете создать животное типов: cat, dog");
                System.out.println("Введите тип животного, которое хотите создать");
                String type = in.next();
                switch (type) {
                    case "cat" -> {
                        Cat cat = new Cat();
                        repository.addAnimal(cat);
                        System.out.println("Вы создали животное: " + cat);
                    }
                    case "dog" -> {
                        Dog dog = new Dog();
                        repository.addAnimal(dog);
                        System.out.println("Вы создали животное: " + dog);
                    }
                    default -> System.out.println("Вы не можете создать животное данного типа");
                }
            }
            if (command.equals("game")) {
                System.out.println("С каким животным вы хотите поиграть? Введите id");
                long id = in.nextLong();
                Animal animal = repository.getAnimalById(id);
                System.out.println("Вы в игре с животным: " + animal);
                System.out.println("Животное умеет говорить. Для того, чтобы животное издало звук" +
                        ", введите say");
                System.out.println("Для прекращения игры с животным введите end");
                boolean inGame = true;
                while (inGame) {
                    System.out.println("Введите команду для игры с животным");
                    String cmd = in.next();
                    switch (cmd) {
                        case "say" -> animal.say();
                        case "end" -> {
                            System.out.println("Вы вышли из игры с животным: " + animal);
                            inGame = false;
                        }
                        default -> System.out.println("Вы ввели неизвестную команду!");
                    }
                }
            }
        }
    }
}
