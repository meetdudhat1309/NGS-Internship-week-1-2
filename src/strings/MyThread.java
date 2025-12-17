package strings;

class MyThread extends Thread {
    //    StringBuilder sb;
    StringBuffer sb;

    public MyThread(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }
    }
}
