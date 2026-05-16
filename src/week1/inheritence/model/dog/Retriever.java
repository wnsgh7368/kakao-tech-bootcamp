package week1.inheritence.model.dog;

import java.util.List;

public class Retriever extends Dog {
    List<String> personalPrey = List.of("소고기", "감자");

    @Override
    public void eat(String prey) {
        if (this.personalPrey.contains(prey)) { // 개인취향 먹이를 먹으면 몸무게 + 15
            this.weight += 15;
            System.out.println(super.getName() + "이가 정말 맛있게 먹습니다!. 몸무게가 15 증가합니다.");
            System.out.println("현재 몸무게: " + this.weight);
        } else if (super.prey.contains(prey)) { // 개과가 먹을 수 있는 먹이면 몸무게 + 3
            this.weight += 3;
            System.out.println("그럭저럭 먹을만 합니다. 몸무게가 3 증가합니다.");
            System.out.println("현재 몸무게: " + this.weight);
        } else {                                // 못 먹으면 몸무게 - 15
            this.weight -= 15;
            System.out.println("입맛에 맞지 않습니다. 몸무게가 15 감소합니다.");
            System.out.println("현재 몸무게: " + this.weight);
        }
    }

    public Retriever(String name) {
        super(name);
        this.weight = 30;
    }
}
