package Activity;


import Office.Employee;

public class program {

    public static void main(String[] args) {

        Employee e1 = new Employee(100,20,10);
        e1.calculateIncome();
        System.out.println(e1.getIncome());
    }
}
