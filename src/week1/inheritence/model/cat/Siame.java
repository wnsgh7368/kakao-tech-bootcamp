package week1.inheritence.model.cat;

import java.util.List;

public class Siame extends Cat {
    List<String> personalPrey = List.of("캣닢", "떡");

    @Override
    public void eat(String prey) {
        if (this.personalPrey.contains(prey)) { // 개인취향 먹이를 먹으면 몸무게 + 10
            super.weight += 10;
            System.out.println(super.getName() + "이가 정말 맛있게 먹습니다!. 몸무게가 10 증가합니다.");
            System.out.println("현재 몸무게: " + this.weight);
        } else if (super.prey.contains(prey)) { // 고양잇과가 먹을 수 있는 먹이면 몸무게 + 3
            super.weight += 3;
            System.out.println("그럭저럭 먹을만 합니다. 몸무게가 3 증가합니다.");
            System.out.println("현재 몸무게: " + this.weight);
        } else {                                // 못 먹으면 몸무게 - 15
            super.weight -= 10;
            System.out.println("입맛에 맞지 않습니다. 몸무게가 10 감소합니다.");
            System.out.println("현재 몸무게: " + this.weight);
        }
    }

    public Siame(String name) {
        super(name);
        this.weight = 10;
    }
}





