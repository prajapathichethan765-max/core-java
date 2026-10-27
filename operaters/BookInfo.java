class BookInfo {
    public static void main(String[] args) {
        System.out.println("Book Information");

        String title = "Java Programming";
        BookInfo.displayTitle(title);

        String author = "James";
        BookInfo.displayAuthor(author);

        int pages = 450;
        BookInfo.displayPages(pages);

        float bookPrice = 599.50f;
        BookInfo.displayPrice(bookPrice);

        boolean isAvailable = true;
        BookInfo.displayAvailability(isAvailable);

        char bookCategory = 'T';
        BookInfo.displayCategory(bookCategory);

        long isbnNumber = 9781234567890L;
        BookInfo.displayIsbn(isbnNumber);
    }

    static void displayTitle(String bookTitle) {
        System.out.println("Title: " + bookTitle);
    }

    static void displayAuthor(String writer) {
        System.out.println("Author: " + writer);
    }

    static void displayPages(int pageCount) {
        System.out.println("Pages: " + pageCount);
    }

    static void displayPrice(float price) {
        System.out.println("Price: " + price);
    }

    static void displayAvailability(boolean available) {
        System.out.println("Available: " + available);
    }

    static void displayCategory(char category) {
        System.out.println("Category: " + category);
    }

    static void displayIsbn(long isbn) {
        System.out.println("ISBN: " + isbn);
    }
}