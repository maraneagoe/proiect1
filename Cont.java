public class Cont {
    public String iban;
    public int currentSum;

    public Cont(String iban, int currentSum) {
        this.iban = iban;
        this.currentSum = currentSum;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(int currentSum) {
        this.currentSum = currentSum;
    }

    public String toString(){
        return "\nDetalii cont: "
                + "\nIban: " + this.iban
                + "\nSuma curenta: " + this.currentSum;
    }
}
