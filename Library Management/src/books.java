import java.util.Scanner;

    public class books{
        book theBooks[] = new book[50];
        public static int count;

        Scanner input = new Scanner(System.in);

        public int compareBookObjects(book b1, book b2){
            if (b1.bookName.equalsIgnoreCase(b2.bookName)){

                System.out.println("Book of this Name Already Exists.");
                return 0;
            }
            if (b1.sNo == b2.sNo){
                System.out.println("Book Name Doesn't Exists.");
                return 0;
            }
            return 1;
        }

        public void addBook(book b){
            for(int i=0; i< count; i++){

                if (this.compareBookObjects(b, this.theBooks[i]) ==0)
                    return;
            }
        }
    }

