public class Employee {
    private int id;
    private String name;
    private String position;

    public Employee() {

    }

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("John Doe");
        employee1.setPosition("Manager");

        Employee employee2 = new Employee(2, "Jane Smith", "Developer");

        System.out.println("Employee 1:");
        System.out.println("ID: " + employee1.getId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Position: " + employee1.getPosition());

        System.out.println();

        System.out.println("Employee 2:");
        System.out.println("ID: " + employee2.getId());
        System.out.println("Name: " + employee2.getName());
        System.out.println("Position: " + employee2.getPosition());
    }
}