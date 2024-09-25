package opgave01;

public class Books {
    public static void main(String[] args) {
        Book bog1 = new Book("Den første bog", "Anton Graabech", 1, "Det gode");
        Book bog2 = new Book("Den første bog 2", "Anton Ramus", 12432, "Det gode");
        Book bog3 = new Book("Den første bog 3", "Anton Graabech Ramus", 12, "Det gode");

        printBook(bog1);
        printBook(bog2);
        printBook(bog3);
    }

    public static void printBook(Book bookToPrint) {
        System.out.println(bookToPrint.title + ", skrevet af: " + bookToPrint.author + " på " + bookToPrint.pages + " sider. Udgivet af: " + bookToPrint.publisher + ".");
    }
}
