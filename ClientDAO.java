import java.util.List;

public interface ClientDAO {
    public List <Client> getAllClients();
    public Client getClientByClientCode(int clientCode);
    public void addClient(Client client);

}
