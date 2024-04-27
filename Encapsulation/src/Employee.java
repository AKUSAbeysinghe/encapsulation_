class Employee {

    private String name;
    private int id;
    private  double salary;
    private String contactno;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }


    public  double getSalary(){
        return  salary;
    }

    public  void setSalary(double salary){
        this.salary=salary;
    }

    public String getContact(){
        return contactno;
    }

    public void setContact(String contactno){
        this.contactno=contactno;
    }


}

class EmployeeDocument{

    public static void main(String[] args) {
        Employee e=new Employee();
        e.setName("Amal");
        e.setId(12345);
        e.setContact("011234567");
        e.setSalary(35000.00);

        //String employeeName = e.getName();
        //int employeeId = e.getId();
        //double employeesalary=e.getSalary();


        System.out.println("Employee name is: " + e.getName());
        System.out.println(e.getName() +"'s id is: "+ e.getId());
        System.out.println(e.getName() +"'s salary is: "+ e.getSalary());
        System.out.println(e.getName()+"'s contact number is: "+e.getContact());


    }
}
