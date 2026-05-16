package week1.thread;

public class Main {
    private static volatile boolean stop = false;

    public static void main(String[] args) {

        Thread dog = new Thread(() -> {
            int count = 1;
            while (!stop) {

                System.out.println("[" + Thread.currentThread().getName() + "] 에서 강아지가 밥을 먹고 있습니다." + " *" + count + "* ");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                count++;
            }
        });
        Thread cat = new Thread(() -> {
            int count = 1;
            while (!stop) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("[" + Thread.currentThread().getName() + "] 에서 고양이가 밥을 먹고 있습니다." + " *" + count + "* ");
                count++;
            }
        });
        dog.start();
        cat.start();

        try {
            System.out.println("[" + Thread.currentThread().getName() + "]: 메인 스레드");
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stop = true;
    }
}
