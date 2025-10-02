import java.util.Arraylist;
import java.util.List;
import java.util.Objects;

public class main {
    public static void Main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Book book1 = new Book("BOO1", " Nigga Balls", "Paul Israel", "123456789", 497, "Slavery");
        Book book2 = new Book("BOO2", "Black Dog", "Julius Fuentes", "358462394", 498, "Slavery");

        Magazine mag1 = new Magazine("MOO1", "The Oppression of the Africans", "Racism", 120, "February", false);
        Magazine mag2 = new Magazine("MOO2", "The GODS must be crazy", "Racism", 210, "April", false);

        DVD dvd1 = new DVD("DOO1","Black Friday Month", "Samuel L. Jackson",130, "18+", "Racism");
        DVD dvd2 = new DVD("DOO2","The Freedom of the Black Slaves", "Mark Henry", 120, "18+", "Racism");

        manager.addItem(book1);
        manager.addItem(book2);
        manager.addItem(mag1);
        manager.addItem(mag2);
        manager.addItem(dvd1);
        manager.addItem(dvd2);

        Student student = new student ("USER1","Paul", "pbisrael07645@liceo.edu.ph","Information Technology");
        Faculty faculty = new Faculty ("USER1", "Darren", "Darrenanoqoaquimsatander@gmai.com", "Education");

        System.out.println("ALL ITEMS");
        manager.displayAllItems();

        System.out.println("BORROWING ITEMS");
        manager.borrowItem("BOO1","Alice");
        manager.borrowItem("MOO2", "Gabriela");
        manager.borrowItem("DOO2","Novert");
        
        System.out.println("BORROWING STATUSES");
        manager.displayAllItems();
        
        System.out.println("AVAILABLE ITEMS");
        manager.displayAllItems();
        
        System.out.println("RETURNING ITEMS");
        manager.returnItem("BOO2");
        manager.returnItem("DOO1");
        
        int daysLate = 3;
        double totalFees = manager.calculatorTotalLateFees(daysLate);
        system.out.println
    }
}
