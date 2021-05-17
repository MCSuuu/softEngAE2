import java.util.ArrayList;

public class TeachingReq {
    private String reqTrain;
    private int reqStaffNo;

    public TeachingReq(String t,int n){ //TeachingReq objects contains 1 required training
        reqTrain = t;                   //and required number of staffs.
        reqStaffNo=n;
    }

    public String toString(){
         return "Required training: "+reqTrain+",required number of staffs: "+ reqStaffNo;
    }
}
