package programme_24_method_overriding;


public class Test {
    public static void main(String[] args) {
        SBI s=new SBI();
       ICICI i=new ICICI();
       AXIS a=new AXIS();
        System.out.println("SBI rate of interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate OF Interest: "+i.getRateOfInterest());
       System.out.println("AXIS Rate Of Interest: "+a.getRateOfInterest());

    }}
