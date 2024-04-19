package domain;
public class Manager extends Employee {

    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = empackage domain;

/**
 * Представляє менеджера, який є працівником компанії та керує іншими працівниками.
 */
public class Manager extends Employee {

    /**
     * Конструює менеджера з вказаними підлеглими працівниками, ім'ям, посадою, рівнем та відділом.
     *
     * @param employees масив підлеглих працівників
     * @param name      ім'я менеджера
     * @param jobTitle  посада менеджера
     * @param level     рівень менеджера
     * @param dept      відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядкове представлення менеджера, включаючи його основну інформацію та підлеглих працівників.
     *
     * @return рядкове представлення менеджера
     */
    @Override
    public String toString() {
        return super.toString() + "\nПрацівники: " + getEmployees(); 
    }

    /**
     * Конструює менеджера з вказаними підлеглими працівниками.
     *
     * @param employees масив підлеглих працівників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструює менеджера зі значеннями за замовчуванням.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Отримує список підлеглих працівників менеджера.
     *
     * @return список підлеглих працівників
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює підлеглих працівників менеджера.
     *
     * @param employees список підлеглих працівників
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Отримує список підлеглих працівників менеджера.
     *
     * @return список підлеглих працівників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
ployees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
