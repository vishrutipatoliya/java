public class Encapsulation {
    public  static  void main(String[] args){
        Students s = new Students();
        s.setName("vishruti");
        System.out.println(s.getName());
    }
}
class Students{
    private String name;
    public String getName(){
        return name;
    }
     public  void  setName(String name){
        this.name = name;

     }
}
