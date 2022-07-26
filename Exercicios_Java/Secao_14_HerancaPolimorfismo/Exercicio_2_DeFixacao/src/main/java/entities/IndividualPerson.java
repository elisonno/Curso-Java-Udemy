package entities;

public class IndividualPerson extends TaxPayer{
    private double healthExpenditures;

    public IndividualPerson() {
        super();
    }

    public IndividualPerson(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax;
        if(getAnualIncome() < 20000){
            tax = (getAnualIncome() * 0.15 - getHealthExpenditures() * 0.5);
        }else {
            tax = (getAnualIncome() * 0.25 - getHealthExpenditures() * 0.5);
        }
        return tax;
    }

    @Override
    public String toString() {
        return getName() + ": $ " + String.format("%.2f", tax());
    }
}
