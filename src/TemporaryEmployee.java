public class TemporaryEmployee extends Employee{
    private int hoursWorked;
    private int  hourlyWages;
    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }


    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }




        public  double ssd(){
            double Salary= getHourlyWages()*getHoursWorked();
      //  System.out.println(Salary);
        return  Salary;
        }

    @Override
    public void calculateSalary() {
//        double Salary= getHourlyWages()*getHoursWorked();
//      //  System.out.println(Salary);
//        return  Salary;

    }
}
