import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee>  employees = new ArrayList<Employee>();

        for(int i = 0;i<10;i++){
            Employee employee = new Employee(i,"Name: "+i,(i+20),"Department "+i,"Code "+i,(1000*i));
            employees.add(employee);
        }

        int check = 0;
        Scanner s = new Scanner(System.in);
        int employeeId = 10;


        do {
            System.out.println("---------------------Menu------------------");
            System.out.println("1.Xem danh sách nhân viên\n2.Thêm 1 nhân Viên\n3.Xóa 1 nhân viên\n4.Thoát chương trình");
            System.out.print("Lựa chọn Menu: ");
            check  = s.nextInt();

            if(check == 1){
                for (int i = 0;i<employees.size();i++){
                    System.out.println("Employee ID: "+(employees.get(i).getId()+1));
                    System.out.println("Name: "+employees.get(i).getName());
                    System.out.println("Age: "+employees.get(i).getAge());
                    System.out.println("Code: "+employees.get(i).getCode());
                    System.out.println("Department: "+employees.get(i).getDepartment());
                    System.out.println("Salary rate: "+employees.get(i).getSalaryRate()+"\n");
                }
            } else if (check == 2) {
                System.out.print("Name: ");
                String name = s.next();
                System.out.print("Age: ");
                int age = s.nextInt();
                System.out.print("Department: ");
                String department = s.next();
                System.out.print("Code: ");
                String code = s.next();
                System.out.print("SalaryRate: ");
                float salaryRate = s.nextFloat();

                employees.add(new Employee(employeeId,name,age,department,code,salaryRate));
                employeeId++;
            } else if (check == 3) {
                System.out.print("Nhập ID Employee: ");
                int id = s.nextInt();

                employees.remove(id-1);
                System.out.println("Xóa thành công");
            }

        }while (check != 4);


    }
}