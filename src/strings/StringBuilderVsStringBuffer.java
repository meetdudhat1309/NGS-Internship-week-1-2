package strings;

public class StringBuilderVsStringBuffer {

    public static void main(String[] args) throws InterruptedException {
//        StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer();

        MyThread t1 = new MyThread(sb);
        MyThread t2 = new MyThread(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sb.length());

    }
}

