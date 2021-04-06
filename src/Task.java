public class Task {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover bookMover1 = new FromAvailableStatusMover();
        BookMover bookMover2 = new FromArchivedStatusMover();
        BookMover bookMover3 = new FromBorrowedStatusMover();
        BookMover bookMover4 = new FromOverduedStatusMover();


        bookMover1.moveToStatus(book, Status.ARCHIVED);
        bookMover2.moveToStatus(book, Status.AVAILABLE);
        bookMover1.moveToStatus(book, Status.BORROWED);
        bookMover3.moveToStatus(book, Status.OVERDUED);
        bookMover4.moveToStatus(book, Status.AVAILABLE);

        System.out.println(book.getStatus());
    }
}
