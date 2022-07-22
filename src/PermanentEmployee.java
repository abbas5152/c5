public class PermanentEmployee extends  Employee{


    private  double basicPay;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
        super(employeeId,employeeName);

        this.basicPay=basicPay;
    }



    @Override
    public void calculateSalary() {
//        double pf=getBasicPay()*0.12;
//        double Salary=getBasicPay()-pf;
//            return  Salary;
       // System.out.println(Salary);


    }
    public double ss(){
        double pf=getBasicPay()*0.12;
        double Salary=getBasicPay()-pf;
        return  Salary;

    }



}
