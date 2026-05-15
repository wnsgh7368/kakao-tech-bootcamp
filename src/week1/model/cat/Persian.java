package week1.model.cat;

import java.util.List;

public class Persian extends Cat {

    List<String> personalPrey = List.of("떡볶이", "갈비");

    @Override
    public void eat(String prey) {
        if (this.personalPrey.contains(prey)) { // 개인취향 먹이를 먹으면 몸무게 + 15
            super.weight += 15;
        } else if (super.prey.contains(prey)) { // 개과가 먹을 수 있는 먹이면 몸무게 + 3
            super.weight += 3;
        } else {                                // 못 먹으면 몸무게 - 15
            super.weight -= 15;
        }
    }

    public Persian(String name) {
        super(name);
        this.weight = 30;
    }
}
