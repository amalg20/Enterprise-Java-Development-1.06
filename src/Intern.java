public class Intern extends Employee{
    private static final int SALARY_LIMIT= 20000;
    public Intern(String name, String email, int age, int salary){
        super(name, email, age, salary);
        if(salary>SALARY_LIMIT){
            System.out.println("Salary cannot exceed "+SALARY_LIMIT+" "+ name);
            super.setSalary(SALARY_LIMIT);
        }
    }
    public void setSalary(int salary){
        if(salary>SALARY_LIMIT){
            super.setSalary(SALARY_LIMIT);
        }
    }
}
