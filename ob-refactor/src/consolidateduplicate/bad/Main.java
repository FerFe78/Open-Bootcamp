package consolidateduplicate.bad;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean cerification;

    double calculateExtraSalary(){
        double result = 0;
        if (isEligibleExtraSalary()) {
            result = 500;
            sendMessage(); // metodo que se repite en la condicion
        }else{
            result = 0 ;
            sendMessage(); // metodo que se repite en la condicion
        }
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
