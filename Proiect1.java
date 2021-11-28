import com.sun.jdi.IntegerValue;

import java.util.Date;

public class Proiect1 {
    public static void main (String[] args) {
        Client ivan = new Client("Ivan", "Octavian", 1194, "1980918450018", new Date());
        Client mara = new Client("Neagoe", "Mara", 1145, "2980602160045", new Date());

        Cont contIvan = new Cont("RO71ZRBR", 5000);
        Cont contMara = new Cont("RO93ZRBR", 3000);

        mara.setCont(contMara);
        ivan.setCont(contIvan);

        ClientDAOImpl clientDAO = new ClientDAOImpl();
        clientDAO.addClient(ivan);
        clientDAO.addClient(mara);

//        System.out.println(clientDAO.getAllClients());
        System.out.println(clientDAO.getClientByClientCode(1194));

        Transfer transferInstance = Transfer.getTransfInstance();
        transferInstance.transfMoneyByClientsCodes(clientDAO,1194, 1145,99);
        System.out.println(clientDAO.getAllClients());

    }

}
