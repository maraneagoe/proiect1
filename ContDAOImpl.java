public class ContDAOImpl implements ContDAO{

    @Override
    public void updateCont(Cont cont, int newSum) {
        cont.setCurrentSum(newSum);
    }
}
