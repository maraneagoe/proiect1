public class Transfer {
    private static final Transfer transf = new Transfer();
    private Transfer() { }

    public static Transfer getTransfInstance() {
        return transf;
    }

    public void transfMoneyByClientsCodes(ClientDAOImpl clientDAO, int clientCodeSender, int clientCodeReceiver, int moneySum) {
        Client clientSender = clientDAO.getClientByClientCode(clientCodeSender);
        System.out.println(clientSender);
        Client clientReceiver = clientDAO.getClientByClientCode(clientCodeReceiver);

        Cont contClientSender = clientSender.getCont();
        Cont contClientReceiver = clientReceiver.getCont();

        transferMoneyByAccounts(contClientSender, contClientReceiver, moneySum);
    }
    public void transferMoneyByAccounts(Cont contSender, Cont contReceiver, int moneySum){
        if(moneySum <= contSender.getCurrentSum()) {
            contSender.setCurrentSum(contSender.getCurrentSum() - moneySum);
            contReceiver.setCurrentSum(contReceiver.getCurrentSum() - moneySum);
        } else {
            System.out.println("Not enough money in the sender account");
        }

    }
}
