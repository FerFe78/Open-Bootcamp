package consolidateduplicate.bad;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary() {
        double result = 0;
        if (isElegibleExtraSalary()){
            result = 500;
            sendMessage(); // metodo que se repite en la condicion
        }else{
            result = 0;
            sendMessage(); // metodo que se repite en la condicion
        }
        return result;
    }
    private void sendMessage(){
        // send email
        // connect sntp
        System.out.println("sending message");
    }
    private boolean isElegibleExtraSalary() {
        boolean estudios = seniority<1 || education<1; // categoria
        boolean experiencia = incidents > 10 || !certification; // categoria
        return  estudios || experiencia;
    }


}