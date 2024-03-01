public class Main {
    public static void main(String[] args) {

        // bir class birden fazla imteface i iplemente edebilir yani classlara birden fazla implenet yazılabilir.

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());

        customerManager.add();

    }
}