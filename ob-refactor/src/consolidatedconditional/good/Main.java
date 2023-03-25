package consolidatedconditional.good;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean cerification;

    double calculateExtraSalary(){
        double result = 0;

        if(isElegibleExtraSalary()){
            return result;
        }

        // Calculate extra salary:
        // ...
        return result;
    }

    private boolean isElegibleExtraSalary() {
        // agrupar condiciones utilizando AND (&&) y OR (||)
        boolean estudios =  education<1 || !cerification;
        boolean antiguiedad = seniority<1 || incidents>10 ;
        return estudios || antiguiedad;

    }


}
