package week1;

import week1.model.Animal;
import week1.model.bird.Bird;
import week1.model.bird.Eagle;
import week1.model.bird.Sparrow;
import week1.model.cat.Cat;
import week1.model.cat.Persian;
import week1.model.cat.Siame;
import week1.model.dog.Chihuahua;
import week1.model.dog.Dog;
import week1.model.dog.Retriever;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> preys = List.of("고기", "개사료", "소고기", "감자", "고구마", "개 ",
                "생선", "고양이 사료", "캣닢", "떡", "떡볶이", "갈비", "양갈비", "콩", "부침개", "빵", "모이", "쌀");

        System.out.println("===== 애완동물 키우기 시뮬레이터에 오신걸 환영합니다! =====");
        System.out.println("===== 여러분이 키우고 싶은 동물 종류를 입력해주세요!(1 또는 2 또는 3) =====");
        System.out.println("===== 1. 강아지 || 2. 고양이 || 3. 새 =====");

        // 동물 선택
        int num = sc.nextInt();
        Animal myPet = selectAnimal(num);

        // 시뮬레이션 시작
        boolean next = true;
        while (next){
            System.out.println("\n\n===== 다음으로 취할 행동을 골라주세요 =====");
            System.out.println("===== 1. 내 펫 정보 보기 || 2. 밥 먹이기 || 3. 짖어! =====");
            System.out.println("===== 다른 숫자를 누르면 종료합니다. =====");
            int gestureNum = sc.nextInt();

            if (gestureNum == 1) {
                info(myPet);
            } else if (gestureNum == 2) {
                eat(preys, sc, myPet);
            } else if (gestureNum == 3) {
                myPet.sound();
            } else  {
                System.out.println("종료합니다.");
                next = false;
            }

            // 내 펫의 몸무게가 0 이하면 종료
            if (myPet.getWeight() < 0) {
                System.out.println("===== !!몸무게가 0 이하입니다!! =====");
                System.out.println("===== 펫이 사망하였습니다. 시뮬레이션을 종료합니다. =====");
                next = false;
            }
        }


    }

    private static void info(Animal myPet) {
        System.out.println("===== 내 펫 정보 =====");
        System.out.println("현재 나이: " + myPet.getAge() + " || 현재 이름: " + myPet.getName() + " || 현재 몸무게: " + myPet.getWeight());
    }

    private static void eat(List<String> preys, Scanner sc, Animal myPet) {
        List<String> randomPreys = new ArrayList<>(preys);
        Collections.shuffle(randomPreys);
        List<String> results = randomPreys.subList(0, 3);

        System.out.println("===== 먹이를 골라주세요! 잘못 고르면 몸무게가 감소하니 주의해주세요! =====");
        System.out.println("1번 먹이: " + results.get(0));
        System.out.println("2번 먹이: " + results.get(1));
        System.out.println("3번 먹이: " + results.get(2));
        System.out.print("번호 선택: ");
        int choice = sc.nextInt();
        String selectedFood = results.get(choice - 1);
        myPet.eat(selectedFood);
    }

    private static Animal selectAnimal(int num) {
        Scanner sc = new Scanner(System.in);
        Animal myPet = null;

        if (num == 1) {
            System.out.println("\n\n===== 강아지를 선택하셨군요! 탁월한 선택입니다 =====.");
            System.out.println("===== 다음으로 어떤 종을 키우고 싶은지 입력해주세요! =====");
            System.out.println("===== 1. 치와와 || 2. 리트리버 =====");
            int dogNum = sc.nextInt();
            myPet = selectMyDog(dogNum);
        }
        if (num == 2) {
            System.out.println("\n\n===== 고양이 선택하셨군요! 탁월한 선택입니다 =====.");
            System.out.println("===== 다음으로 어떤 종을 키우고 싶은지 입력해주세요! =====");
            System.out.println("===== 1. 샴 고양이 || 2. 페르시안 고양이 =====");
            int catNum = sc.nextInt();
            myPet = selectMyCat(catNum);
        }

        if (num == 3) {
            System.out.println("\n\n===== 새를 선택하셨군요! 탁월한 선택입니다 =====.");
            System.out.println("===== 다음으로 어떤 종을 키우고 싶은지 입력해주세요! =====");
            System.out.println("===== 1. 독수리 || 2. 참새 =====");
            int birdNum = sc.nextInt();
            myPet = selectMyBird(birdNum);
        }
        return myPet;
    }

    private static Dog selectMyDog(int dogNum) {
        Scanner sc = new Scanner(System.in);

        Dog dog = null;

        if (dogNum == 1) {
            System.out.println("\n===== 치와와를 선택하셨습니다. =====");
            System.out.println("===== 이름을 정해주세요 =====");
            String name = sc.nextLine();
            System.out.println("=====" + name + "!! 멋진 이름이네요! 이제 시뮬레이션을 시작합니다! =====");

            dog = new Chihuahua(name);
        }
        if (dogNum == 2) {
            System.out.println("\n===== 리트리버를 선택하셨습니다. =====");
            System.out.println("===== 이름을 정해주세요 =====");
            String name = sc.nextLine();
            System.out.println("=====" + name + "!! 멋진 이름이네요! 이제 시뮬레이션을 시작합니다! =====");

            dog = new Retriever(name);
        }
        return dog;
    }

    private static Cat selectMyCat(int catNum) {
        Scanner sc = new Scanner(System.in);
        Cat cat = null;

        if (catNum == 1) {
            System.out.println("\n===== 샴 고양이를 선택하셨습니다. =====");
            System.out.println("===== 이름을 정해주세요 =====");
            String name = sc.nextLine();
            System.out.println("=====" + name + "!! 멋진 이름이네요! 이제 시뮬레이션을 시작합니다! =====");

            cat =  new Siame(name);
        }
        if (catNum == 2) {
            System.out.println("\n===== 페르시안 고양이를 선택하셨습니다. =====");
            System.out.println("===== 이름을 정해주세요 =====");
            String name = sc.nextLine();
            System.out.println("=====" + name + "!! 멋진 이름이네요! 이제 시뮬레이션을 시작합니다! =====");

            cat =  new Persian(name);
        }
        return cat;
    }

    private static Bird selectMyBird(int birdNum) {
        Scanner sc = new Scanner(System.in);
        Bird bird = null;

        if (birdNum == 1) {
            System.out.println("\n===== 독수리를 선택하셨습니다. =====");
            System.out.println("===== 이름을 정해주세요 =====");
            String name = sc.nextLine();
            System.out.println("=====" + name + "!! 멋진 이름이네요! 이제 시뮬레이션을 시작합니다! =====");

            bird =  new Eagle(name);
        }
        if (birdNum == 2) {
            System.out.println("\n===== 참새를 선택하셨습니다. =====");
            System.out.println("===== 이름을 정해주세요 =====");
            String name = sc.nextLine();
            System.out.println("=====" + name + "!! 멋진 이름이네요! 이제 시뮬레이션을 시작합니다! =====");

            bird =  new Sparrow(name);
        }
        return bird;
    }
}