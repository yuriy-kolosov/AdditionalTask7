class BookCapacity {

    static Book[] bookArray = new Book[5];
    final static int BOOK_CAPACITANCE = 5;
    static int bookOccupancy = 0;

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Дополнительное задание 7 - 1.9 Объекты и классы");
        System.out.println();
        System.out.println("               Задача среднего уровня сложности");
        System.out.println();

        Author author1 = new Author("Jack", "London");
        Author author2 = new Author("John", "Steinbeck");
        Author author3 = new Author("Stephen", "King");
        Author author4 = new Author("William", "Shakespeare");
        Author author5 = new Author("George", "Byron");
        Author author6 = new Author("Percy", "Shelley");

        Book book1 = new Book("Love of Life", author1, 1905);
        Book book2 = new Book("The Grapes of Wrath", author2, 1939);
        Book book3 = new Book("The Stand", author3, 1978);
        Book book4 = new Book("Romeo and Juliet", author4, 1597);
        Book book5 = new Book("Childe Harold's Pilgrimage", author5, 1812);
        Book book6 = new Book("Ozimandias", author6, 1826);

        System.out.println("   Исходные объекты:");
        System.out.println();

        System.out.println("            Книга 1");
        System.out.println("Автор: " + author1.getName() + " " + author1.getLastName());
        System.out.println("Наименование: " + book1.getName());
        System.out.println("Год издания: " + book1.getYearPublication());

        System.out.println("            Книга 2");
        System.out.println("Автор: " + author2.getName() + " " + author2.getLastName());
        System.out.println("Наименование: " + book2.getName());
        System.out.println("Год издания: " + book2.getYearPublication());

        System.out.println("            Книга 3");
        System.out.println("Автор: " + author3.getName() + " " + author3.getLastName());
        System.out.println("Наименование: " + book3.getName());
        System.out.println("Год издания: " + book3.getYearPublication());

        System.out.println("            Книга 4");
        System.out.println("Автор: " + author4.getName() + " " + author4.getLastName());
        System.out.println("Наименование: " + book4.getName());
        System.out.println("Год издания: " + book4.getYearPublication());


        System.out.println("            Книга 5");
        System.out.println("Автор: " + author5.getName() + " " + author5.getLastName());
        System.out.println("Наименование: " + book5.getName());
        System.out.println("Год издания: " + book5.getYearPublication());

        System.out.println("            Книга 6");
        System.out.println("Автор: " + author6.getName() + " " + author6.getLastName());
        System.out.println("Наименование: " + book6.getName());
        System.out.println("Год издания: " + book6.getYearPublication());
        System.out.println();

        putBookArray(book1);
        putBookArray(book2);
        putBookArray(book3);
        putBookArray(book4);
        putBookArray(book5);
        putBookArray(book6);

        System.out.println();
        System.out.println("   Печать всех книг из массива:");
        System.out.println();

        printBookArray();

    }

    public static void putBookArray(Book book1) {

        if (BookCapacity.bookOccupancy < BookCapacity.BOOK_CAPACITANCE) {
            BookCapacity.bookArray[BookCapacity.bookOccupancy] = book1;
        } else {
            System.out.println("Массив заполнен (всего 5 книг)");
        }
        BookCapacity.bookOccupancy++;
    }

    public static void printBookArray() {

        for (Book bA : BookCapacity.bookArray) {
            System.out.println("\"" + bA + "\"");
        }
    }

}