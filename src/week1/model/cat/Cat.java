package week1.model.cat;

import week1.model.Animal;

import java.util.List;

public class Cat extends Animal {
    List<String> prey = List.of("생선", "고양이 사료"); // 먹을 수 있는 먹이

    @Override
    public void sound() {
        if (super.weight > 10) {
            System.out.println("힘차게 소리를 냅니다!: 냐옹!!");
        } else {
            System.out.println("기운빠지게 소리를 냅니다: 냐옹...");
        }
    }

    public Cat(String name) {
        super(name);
    }
}
