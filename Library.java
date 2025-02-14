class Library {
    private int fineAmount;

    // Default constructor
    public Library() {
        this.fineAmount = 5;
    }

    public void displayFine() {
        System.out.println("Default fine amount: $" + fineAmount);
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.displayFine();
    }
}
