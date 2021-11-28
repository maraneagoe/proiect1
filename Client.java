import java.util.Date;

public class Client {
    public String firstName;
    public String lastName;
    public int clientCode;
    public String cnp;
    public Date registerDate;
    public Cont cont;

    public Cont getCont() {
        return cont;
    }

    public void setCont(Cont cont) {
        this.cont = cont;
    }

    public Client(String firstName, String lastName, int clientCode, String cnp, Date registerDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientCode = clientCode;
        this.cnp = cnp;
        this.registerDate = registerDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getClientCode() {
        return clientCode;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String toString() {
        return  "\nDetalii client: "
                + "\nNume: " + this.firstName
                + "\nPrenume: " + this.lastName
                + "\nCod Client: " + this.clientCode
                + "\nCNP: " + this.cnp
                + "\nData Inregistrarii: " + this.registerDate
                + this.cont + "\n";

    }

}
