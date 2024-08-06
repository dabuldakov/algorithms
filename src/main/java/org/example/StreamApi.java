package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StreamApi {
    public static final List<User> userList = Arrays.asList(
            new User(1, "Michael", "Robert", 37, "TR"),
            new User(2, "Mary", "Patricia", 11, "EN"),
            new User(3, "John", "Michael", 7, "FR"),
            new User(4, "Jennifer", "Linda", 77, "TR"),
            new User(5, "William", "Elizabeth", 23, "US"),
            new User(6, "Sue", "Jackson", 11, "IT"),
            new User(7, "Michael", "Tommy", 37, "EN")
    );


    public static void main(String... args) {

        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {
            for (int i = 1; i < 6; i++) {
                executorService.execute(new Task(i));
            }
        }


        double averageAge = userList.stream()
                .mapToInt(User::getAge)
                .summaryStatistics()
                .getAverage();
        //System.out.print("averageAge: " + averageAge);

    }

    public static class User {
        public User(long id, String firstName, String lastName, int age, String nationality) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.nationality = nationality;
        }

        private long id;
        private String firstName;
        private String lastName;
        private int age;
        private String nationality;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
    }

    private static class Task implements Runnable {
        public Task(int id) {
            this.id = id;
        }

        private final int id;

        @Override
        public void run() {
            System.out.println("Task run: " + id + " | thread id: " + Thread.currentThread().getId());
            System.out.println();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
