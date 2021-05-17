import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
       TeachingReq lab1 = new TeachingReq("lab1","java",3);
        Course class1 = new Course("programming",4039);
        System.out.println(class1);
        System.out.println(lab1);
        class1.addTeaReq(lab1);
        System.out.println(class1);
    }
}
----------------------------------------------
    output:
Course name: programming ,ID: 4039,Course requirements: []
Lab name: lab1,required training: java,required number of staffs: 3
Course name: programming ,ID: 4039,Course requirements: [Lab name: lab1,required training: java,required number of staffs: 3]
