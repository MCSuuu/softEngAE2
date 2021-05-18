import java.util.ArrayList;

public class Course {
    private String name;
    private int courseID;
    private ArrayList<TeachingReq> classRequirements;

    public Course(String n,int c){                        //constructor
        name = n;                                         //Course object will have a course name,course ID and
        courseID= c;                                      //an arrayList storing Teaching requirement objects
        classRequirements = new ArrayList<TeachingReq>();
    }
    public void addTeaReq(TeachingReq tR){
        classRequirements.add(tR);
    }
    public void removeTeaReq(TeachingReq tR){
        classRequirements.remove(tR);
    }
    public String toString(){
        return  name+","+courseID+classRequirements+" ";
    }
    public ArrayList<TeachingReq> getReq(){
        return classRequirements;
    }
}
