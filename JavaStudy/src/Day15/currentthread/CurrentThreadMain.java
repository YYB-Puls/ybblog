package Day15.currentthread;

public class CurrentThreadMain {
    public static void main(String[] args) {
        PrintCurrentThreadName threadName = new PrintCurrentThreadName();
        threadName.printCurrentThreadName();
    }
}
