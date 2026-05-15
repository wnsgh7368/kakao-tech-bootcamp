package week1.model.bird;

import week1.model.Animal;

import java.util.List;

public class Bird extends Animal {
    List<String> prey = List.of("모이", "쌀"); // 먹을 수 있는 먹이

    @Override
    public void sound() {
        if (super.weight > 10) {
            System.out.println("힘차게 소리를 냅니다!: 짹짹!!");
        } else {
            System.out.println("기운빠지게 소리를 냅니다: 짹짹...");
        }
    }

    public Bird(String name) {
        super(name);
    }
}
