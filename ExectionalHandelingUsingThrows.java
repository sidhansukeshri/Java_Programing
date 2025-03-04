class ExectionHandelingUsingThrows {
    static void throwone() throws IllegalAccessException {
        System.out.println("Inside throwone");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
        try {
            throwone();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}
