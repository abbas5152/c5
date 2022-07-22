public class Loan {
    Loan(){

    }
    public static double calculateLoanAmount(Employee employeeObj){
        double l=0;
        if(employeeObj instanceof  PermanentEmployee){
            PermanentEmployee p=(PermanentEmployee)employeeObj;
          l=  p.ss() * 0.15;
        }
        else if(employeeObj instanceof TemporaryEmployee){
            TemporaryEmployee T=(TemporaryEmployee)employeeObj;
            l= T.ssd()*0.10;
        }
 return  l;
    }
}
