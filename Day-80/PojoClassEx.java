
package pojoClass;

class EmployeeEx {
    private int id;
    private String name;
    private int salary;

    // default constructor
    public EmployeeEx(){

    }

    // para meterized constructor
    public EmployeeEx(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "EmployeeEx{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}





class pojoEx{
    public static void main(String[] args) {
       // EmployeeEx ex = new EmployeeEx(101,"Firdose",100000); // calling parameterised constructor
        // System.out.println(ex);

        // by accessing setters nd getters
        EmployeeEx ex = new EmployeeEx();
        ex.setId(101);
        ex.setName("Firdose");
        ex.setSalary(100000);

        System.out.println("Id is: " + ex.getId());
        System.out.println("Name is: " + ex.getName());
        System.out.println("Salary is: " + ex.getSalary());


    }
}


o/p:

Id is: 101
Name is: Firdose
Salary is: 100000