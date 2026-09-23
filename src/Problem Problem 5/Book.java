class Book{
        private String title;
        private String author;
        Book(String title){
            this(title, "Unknown");
        }
        Book(String title, String author){
            this.title = title;
            this.author = author;
            System.out.println("Book title: "+ title + "\n" + "Book author: "+ author);
        }
    public static void main(String args[]){
        Book a = new Book("Charulota", "Manjulika");
    }

}
