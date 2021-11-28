import java.util.ArrayList;
import java.util.List;

public class ClientDAOImpl implements ClientDAO {

    List<Client> clients;
    public ClientDAOImpl() {
        clients = new ArrayList<>();
    }

    @Override
    public List<Client> getAllClients() {
        return clients;
    }

    @Override
    public Client getClientByClientCode(int clientCode) {
        for(Client client : clients) {
            if(client.getClientCode() == clientCode) {
                System.out.println("Found client with client code: " + clientCode);
                return client;
            }
        }
        System.out.println("Not found client with client code: " + clientCode);
        return null;
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

}
