package week1.model.dog;

import week1.model.Animal;

import java.util.List;

public class Dog extends Animal {

    List<String> prey = List.of("고기", "개사료"); // 먹을 수 있는 먹이

    @Override
    public void sound() {
        if (super.weight > 10) {
            System.out.println("힘차게 소리를 냅니다!: 멍멍!!");
        } else {
            System.out.println("기운빠지게 소리를 냅니다: 멍멍...");
        }
    }

    public Dog(String name) {
        super(name);
    }
}
