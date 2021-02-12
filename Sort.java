public class Sort {

    public static void main(String[] args) {
        System.out.println("start");
        int[] kek = { 10, 1, 20 };
        
        for (int i : kek) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(i * 1000);
                        System.out.println(i);
                    } catch (Exception e) {
                        // donothing
                    }
                }
            }).start();

        }
        System.out.println("fin");
    }
}
