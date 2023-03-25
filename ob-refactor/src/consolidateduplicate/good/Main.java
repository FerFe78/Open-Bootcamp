package consolidateduplicate.good;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean cerification;

    double calculateExtraSalary(){
        double result = 0;
        if (isEligibleExtraSalary()) { // verdadero
            result = 500;
        }else{  // falso
            result = 0 ;
        }
        sendMessage();
        return result;
    }
    private void sendMessage(){
        // send email
        // connect smtp
        System.out.println("Sending message");
    }
    private boolean isEligibleExtraSalary(){
        boolean estudios =  education<1 || !cerification;
        boolean antiguiedad = seniority<1 || incidents>10 ;
        return estudios || antiguiedad;
    }
}
