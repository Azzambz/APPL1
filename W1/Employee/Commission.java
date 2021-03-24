public class Commission extends Hourly{
    private double totalsales;
    private double commissionrate;
    
    public Commission (String eName, String eAddress, String ePhone,
    String socSecNumber, double rate, double commissionrate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionrate =  commissionrate;
    }
    
    public void addSales(double totalsales) {
        this.totalsales = totalsales;
    }
    
    @Override
    public double pay() {
        double payment = super.pay() + (totalsales*commissionrate);
        totalsales = 0;
        return payment;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales : " + totalsales;
        return result;
    }
}
