public class CompoundInterest {
    public static void main (String[] args){

        int pr = 3500;
        int te = 15;
        double ra = 0.1;
        int num = 4;
        double amount = pr * Math.pow(1 + (ra / num), num * te);
        System.out.println("The amount is " + amount);
        double compundInterest = amount - pr;
        System.out.println("The compound Interest is " + compundInterest);

//        CompoundInterest compoundInterest = new CompoundInterest();
//        compoundInterest.calculate(int 10000,int 10,double 0.06,int 12);
    }

    public static void calculate(int pr, int te, double ra, int num){
        double amount = pr * Math.pow(1 + (ra / num), num * te);
        double compundInterest = amount - pr;
        System.out.println(compundInterest);
    }
}
