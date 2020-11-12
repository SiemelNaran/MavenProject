package example.sometest;


class Interrupted {
    public static void main(String[] args) {
        assertFalse(Thread.currentThread().isInterrupted());
        assertFalse(Thread.currentThread().isInterrupted());
        Thread.currentThread().interrupt();
        System.out.println("hello world");
        // see https://stackoverflow.com/questions/64673303/thread-interrupted-flag-is-reset-when-system-out-println-in-maven
        // when run from IntelliJ, Eclipse, or command line Thread.currentThread().isInterrupted() is true
        // when run from mvn test, then Thread.currentThread().isInterrupted() is false
        // seems mvn somehow resets the interrupted flag
        assertTrue(Thread.currentThread().isInterrupted(), "first");
        assertTrue(Thread.currentThread().isInterrupted(), "second");
    }
    
    private static void assertFalse(boolean value) {
        if (value) {
            throw new RuntimeException("should be false");
        }
    }
    
    private static void assertTrue(boolean value, String text) {
        if (!value) {
            throw new RuntimeException("should be true " + text);
        }
    }
}
