import java.util.ArrayList;

public class TeachingReq {
    private String reqTrain;
    private int reqStaffNo;
    private ArrayList<String> rT;
    public TeachingReq(String t,int n){ //TeachingReq objects contains required training
        rT= new ArrayList<String>();
        rT.add(t);                      //and required number of staffs.
        reqStaffNo=n;                   //when creating TeachingReq objects,create an ArrayList and
    }                                   //add training into the arrayList

    public String toString(){
         return "Required training: "+rT+",required number of staffs: "+ reqStaffNo;
    }
}
