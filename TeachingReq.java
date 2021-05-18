public class TeachingReq {
    private String reqTrain;
    private int reqStaffNo;
    private String labName;


    public TeachingReq(String l,String t,int n){ //TeachingReq objects contains 1 lab name
        labName = l;                             //1 required training
        reqTrain = t;                            //and 1 required number of staffs.
        reqStaffNo= n;

    }

    public String toString(){
         return labName+","+reqTrain+","+reqStaffNo;
    }
    public String getTrain(){
        return this.reqTrain;
    }
}
