public class Performance {

    private String performanceID;
    private String performanceName;
    private String performanceLeadName;
    private int performanceRank;

    public Performance(String performanceID, String performanceName, String performanceLeadName, int performanceRank){
        this.performanceID = performanceID;
        this.performanceName = performanceName;
        this.performanceLeadName = performanceLeadName;
        this.performanceRank = performanceRank;
    }

    public void setPerformanceID(String performanceID){
        this.performanceID = performanceID;
    }

    public String getPerformanceID(){
        return performanceID;
    }
    
    public void setPerformanceName(String performanceName){
        this.performanceName = performanceName;
    }

    public String getPerformanceName(){
        return performanceName;
    }

    public void setPerformanceLeadName(String performanceLeadName){
        this.performanceLeadName = performanceLeadName;
    }

    public String getPerformanceLeadName(){
        return performanceLeadName;
    }

    public void setPerformanceRank(int performanceRank){
        this.performanceRank = performanceRank;
    }

    public int getPerformanceRank(){
        return performanceRank;
    }

    public String toString() {
        return "Performance{PerformanceID='" + performanceID + "', PerformanceName='" + performanceName + "', PerformanceLeadName='" + performanceLeadName + "', PerformanceRank='" + performanceRank + "'}";
    }


}
