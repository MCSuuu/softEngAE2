import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        TeachingReq req1 = new TeachingReq("java",3);
        Course class1 = new Course("programming",4039);
        System.out.println(class1);
        System.out.println(req1);
        class1.addTeaReq(req1);
        System.out.println(class1);

    }
}
