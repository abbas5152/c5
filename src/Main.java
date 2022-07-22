public class Main {

    public static void main(String[] args) {
          //Create a Loan object by name loan
        double permanentEmployeeLoan=Loan.calculateLoanAmount(new PermanentEmployee(1,"Name1",1000));
        double temporaryEmployeeLoan=Loan.calculateLoanAmount(new TemporaryEmployee(2,"Name2",20,100));
        System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
        System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);

//       PermanentEmployee p=new PermanentEmployee(1,"Name1",1000);
//       p.calculateSalary();
    }
}
