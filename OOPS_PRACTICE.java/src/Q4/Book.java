package Q4;

import java.util.ArrayList;
import java.util.ArrayList;
public class Book  {

    ArrayList<String> titles =new ArrayList<>();
    ArrayList<String> authors =new ArrayList<>();
    ArrayList<String> ISBN=new ArrayList<>();
     public void add(String title , String author , String ISBN_num) {
         titles.add(title);
         authors.add(author);
         ISBN.add(ISBN_num);
    }
    public void show() {
        for (int i = 0; i < titles.toArray().length; i++) {
            System.out.print(titles.get(i) + "  ");
            System.out.print(authors.get(i) + "  ");
            System.out.println(ISBN.get(i));
        }
    }

   public void delete(int index){
         titles.remove(index);
        authors.remove(index);
        ISBN.remove(index);
    }
}
