public class Interset_calculator {

    public static double calculate_interset(double principle,double rate, double time){
        return principle*rate*time;
    }
    public static void main(String[] args) {
        System.out.println(Interset_calculator.calculate_interset(155.5,7.0,5.0));
    }
}
