public class Student2 {
    int id;

    void setid(int id){
        this.id = id;
    }

    public static void main(String[] args){
        Student2 obj = new Student2();
        obj.setid(579);
        System.out.println(obj.id);
    }
}

