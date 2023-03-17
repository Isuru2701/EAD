package Office;
public class Employee {

    double salary, transport, incentive, income;

    public Employee(double s, double t, double c) {
        this.salary = s;
        this.transport = t;
        this.incentive = c;


    }

    public void calculateIncome() {
        income = salary + incentive + transport;
    }

    public double getIncome() {
        return income;
    }


}
