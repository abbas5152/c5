import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Your Date of Birth in dd-MM-yyyy");
        String age=s1.next();
      try {
          LocalDate d = LocalDate.parse(age, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
          LocalDate n = LocalDate.now();
          Period p = Period.between(d, n);
          if(p.getDays()==0 && p.getMonths()==0 && p.getYears() >= 18){

              System.out.println("Happy Birthday, You are eligible to cast your vote");
          }

         else if (p.getYears() >= 18) {
              System.out.println("You are eligible to cast your vote");
          } else if (d.isAfter(n)) {
              System.out.println("Date of birth should not be in future");
          } else if (p.getYears()<18) {
              System.out.println("You are Not eligible to cast your vote");

          }

      }
      catch (DateTimeParseException dtp){
          System.out.println("please pass the date in the proper format");
      }
    }
}
