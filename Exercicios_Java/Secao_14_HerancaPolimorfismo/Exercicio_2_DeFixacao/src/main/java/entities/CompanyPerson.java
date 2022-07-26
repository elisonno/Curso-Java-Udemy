package entities;

public class CompanyPerson extends TaxPayer{
    private int numberOfEmployees;

    public CompanyPerson() {
        super();
    }

    public CompanyPerson(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    /*Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
    funcionários, ela paga 14% de imposto.
    Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
    400000 * 14% = 56000.00*/

    @Override
    public double tax() {
        if(getNumberOfEmployees() <=10 ){
            return getAnualIncome() * 0.16;
        }else {
            return getAnualIncome() * 0.14;
        }
    }

    @Override
    public String toString() {
        return getName() + ": $ " + String.format("%.2f", tax());
    }
}
