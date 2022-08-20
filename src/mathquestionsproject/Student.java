
package mathquestionsproject;

public class Student {
    private String firstName;
    private String lastName;
    private int studentID;
    private int classV;
    
    public Student(String FN, String LN, int SID, int CV){
        this.firstName=FN;
        this.lastName=LN;
        this.studentID=SID;
        this.classV=CV;
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getfirstName(){
        return this.firstName;
    }
    public void setfirstName(String FN){
        this.firstName=FN;
    }
        public String getlastName(){
        return this.lastName;
    }
    public void setlastName(String LN){
        this.lastName=LN;
    }
        public int getstudentID(){
        return this.studentID;
    }
    public void setstudentID(int SID){
        this.studentID=SID;
    }
        public int getclassV(){
        return this.classV;
    }
    public void setclassV(int CV){
        this.classV=CV;
    }
    public String toString(){
        return "Info:\nFirst Name: "+this.firstName+
                "\nLast Name: "+this.lastName+
                "\nStudent ID: "+this.studentID+
                "\nClass: "+this.classV;
    }
    
    
}
