import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);

        return date.getDayOfWeek().toString().charAt(0)
                + date.getDayOfWeek().toString().substring(1).toLowerCase();
    }
}
