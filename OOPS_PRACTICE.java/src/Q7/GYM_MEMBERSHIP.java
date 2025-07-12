package Q7;

public class GYM_MEMBERSHIP {
    String name ;
    String type ;
    int duration ;
 public   GYM_MEMBERSHIP(String name , String type , int duration) {
    this.name = name;
    this.type = type;
    this.duration = duration;
    }

    public void amount(){
      int   i = (6*duration);
        System.out.println(i);
}

public void discount(){
        if(type.equalsIgnoreCase("annual")){
            System.out.println("you got 20% discount");

        }
        else{
            System.out.println("no availabe");
        }
}

}
