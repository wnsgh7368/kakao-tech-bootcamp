package week1.inheritence.model;

public abstract class Animal {
    // 필드 선언
    public int age;
    public int weight;
    private final String name;

    // 기능 선언
    public void sound() {}
    public void eat(String prey) {}
    public void sleep() {}

    public Animal(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
