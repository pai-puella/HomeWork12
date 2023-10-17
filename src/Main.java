public class Main {
    public static class Author {
        private String firstName;
        private String lastName;

        public Author(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    public static class Book {
        private String title;
        private Author author;
        private int year;

        public Book(String title, Author author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public Author getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public static class Library {
        public static void main(String[] args) {
            // Создание объектов авторов
            Author author1 = new Author("Иван", "Иванов");
            Author author2 = new Author("Петр", "Петров");

            // Создание объектов книг
            Book book1 = new Book("Книга 1", author1, 2000);
            Book book2 = new Book("Книга 2", author2, 2010);

            // Изменение года публикации одной из книг
            book1.setYear(2005);

            // Вывод информации о книгах
            System.out.println("Название: " + book1.getTitle());
            System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
            System.out.println("Год публикации: " + book1.getYear());

            System.out.println("Название: " + book2.getTitle());
            System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
            System.out.println("Год публикации: " + book2.getYear());
        }
    }
}
