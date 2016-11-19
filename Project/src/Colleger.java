
public class Colleger extends Person {

    private double FinalScore,project,uts,uas;

    public Colleger(String name,String gender,int age,double project, double uts, double uas) {
        super(name,gender,age);
        this.project=project;
        this.uts=uts;
        this.uas=uas;
    }
    
    public double calcFinalScore(){
        FinalScore=(((0.3 * project) + (0.3 * uts)) + (0.4 * uas));
        return FinalScore;
    }
    
    public double getUTS(){
        return uts;
    }
    
    public double getUAS(){
        return uas;
    }
    
    public double getProject(){
        return project;
    }
    
}
