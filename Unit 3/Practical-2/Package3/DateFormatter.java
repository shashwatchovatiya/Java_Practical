package Package3;

public class DateFormatter {
    public String getCurrentDate() {
        return java.time.LocalDate.now().toString();
    }
}