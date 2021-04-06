public class Book {
    private final String title;
    private Status status;

    public Book(String title) {
        this.title = title;
        this.status = Status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
