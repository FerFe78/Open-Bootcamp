package cosolidatedconditional.good;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education ;
    private int incidents;
    private boolean certification ;

    double calculateSalary(){

        double result = 0;
        if (isEligibleExtraSalary()) {
            return result;
        }

        // calculate extra salary
        result +=5;

        return result;
    }

    private boolean isEligibleExtraSalary(){
        boolean estudios = seniority<1 || education<1; // categoria
        boolean experiencia = incidents > 10 || !certification; // categoria
        return  estudios || experiencia;
    }
}
