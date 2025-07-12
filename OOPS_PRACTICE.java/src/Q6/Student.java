package Q6;

import java.util.ArrayList;

public class Student {

String name ;
char g ;
public Student(String name , char g){
    this.name = name;
    this.g = g;
}
    ArrayList<String> courses =new ArrayList<>();

public void setcourse(String name_course){
    courses.add(name_course);
}
public  void show()
{
    System.out.println(name);
    System.out.println(g);
    for(int i = 0 ; i < courses.size() ; i++){
        System.out.println(courses.get(i));
    }
}
public  void remover(int index_number) {
courses.remove(index_number);


}
}



