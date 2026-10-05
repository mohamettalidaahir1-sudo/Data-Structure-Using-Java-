package Assignment_1;



    public class Employee {
        static int count;
        private int id;
        private String first_Name;
        private String last_name;
        private int salary;

        //Constructors

        //Default
        Employee(){
            count++;
            id=count;
            first_Name="Unknow";
            last_name="Unknow";
            salary=0;
        }

        //Parameterized

        Employee(String fName,String lName,int salary){
            count++;
            this.id=count;
            this.first_Name=fName;
            this.last_name=lName;
            this.salary=salary;
        }

        public int getId(){
            return  this.id;
        }
        public  String getName(){
            return first_Name+" "+last_name;
        }
        public String getFirstName(){
            return this.first_Name;
        }
        public  int getSalary(){
            return this.salary;
        }
        public  int getAnualSalary(){
            return salary*12;
        }
        public int raiseSalary(int percent){
            int raiseSalary=this.salary+(this.salary/percent);
            this.salary=raiseSalary;
            return salary;
        }

        public String toString(){
            return "========== Employee Info ==========\n" +
                    "Id: "+id+"\nFirst Name: "+first_Name+"\nLast Name: "+last_name+"\nFull Name: "+getName()+"\nSalary: $"+salary+"\nAnual Salary: $"+getAnualSalary();
        }

    }
    class test{
        public static void main(String[] args) {

            Employee em1=new Employee("Mohamed","Ali Daahir",200);
            em1.toString();
            Employee em2=new Employee("Xuseen","Ali ",2000);
            em2.toString();
            Employee em3=new Employee("muuse","Ali ",290);
            System.out.println(em3.toString());
            em3.raiseSalary(20);
            System.out.println(em3.toString());
        }
    }


