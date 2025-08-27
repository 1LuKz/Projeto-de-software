public class Note{
    private double note01;
    private double note02;
    private double note03;

    public Note(double note01, double note02, double note03){
        this.note01 = note01;
        this.note02 = note02;
        this.note03 = note03;
    }

    public double getNote01(){
        return note01;
    }

    public double getNote02(){
        return note02;
    }

    public double getNote03(){
        return note03;
    }

    public String averageNote(){
        double average = (note01 + note02 + note03) / 3;
        return average >= 7 ? "Approved" : average >= 3 ? "Exam" : "Failed";
    }
}