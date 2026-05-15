package week1.model.bird;

import java.util.List;

public class Eagle extends Bird {
    List<String> personalPrey = List.of("양갈비", "콩");

    @Override
    public void eat(String prey) {
        if (this.personalPrey.contains(prey)) { // 개인취향 먹이를 먹으면 몸무게 + 12
            super.weight += 12;
            System.out.println(super.getName() + "이가 정말 맛있게 먹습니다!. 몸무게가 12 증가합니다.");
            System.out.println("현재 몸무게: " + this.weight);
        } else if (super.prey.contains(prey)) { // 새과 먹을 수 있는 먹이면 몸무게 + 2
            super.weight += 2;
            System.out.println("그럭저럭 먹을만 합니다. 몸무게가 2 증가합니다.");
            System.out.println("현재 몸무게: " + this.weight);
        } else {                                // 못 먹으면 몸무게 - 12
            super.weight -= 12;
            System.out.println("입맛에 맞지 않습니다. 몸무게가 12 감소합니다.");
            System.out.println("현재 몸무게: " + this.weight);
        }
    }
    public Eagle(String name) {
        super(name);
        this.weight = 20;
    }
}
