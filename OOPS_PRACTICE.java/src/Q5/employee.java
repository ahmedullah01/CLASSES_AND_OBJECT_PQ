package Q5;

public class employee {
    String name ;
    String salary;
    int year;
  public  employee( String name , String salary , int year){
        this.name = name;
        this.salary = salary;
        this.year = year ;
    }
    public int  service(){
        int i = (2025-year);

        return i;
    }
    public void show (){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(year);

    }
}
