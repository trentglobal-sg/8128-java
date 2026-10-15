public class FullTimeEmployee extends Employee {
    private double monthlySalary = 0;
    private int leave = 0;

    public FullTimeEmployee() {
        super(); // call the parent's class default constructor
                 // actually optional, Java will do it for you
    }

    public FullTimeEmployee(String firstName,
            String lastName,
            String email,
            double monthlySalary,
            int leave) {
        super(firstName, lastName, email);
        setMonthlySalary(monthlySalary);
        setLeave(leave);

    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getLeave() {
        return leave;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        }

    }

    public void setLeave(int leave) {
        if (leave >= 0) {
            this.leave = leave;
        }

    }

}
