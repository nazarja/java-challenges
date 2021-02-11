import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        Branch branch = this.findBranch(branchName);
        if (branch == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = this.findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = this.findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName,transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
            Branch branch = this.findBranch(branchName);
            if (branch != null) {
                ArrayList<Customer> customers = branch.getCustomers();
                if (customers != null) {
                    System.out.printf("Customer details for branch %s%n", branch.getName());

                    int i = 0;
                    for (Customer customer : customers) {
                        System.out.printf("Customer: %s[%s]%n",customer.getName(), ++i);
                        if (printTransactions) {
                            ArrayList<Double> transactions = customer.getTransactions();

                            System.out.println("Transactions");
                            for (int j = 0; j < transactions.size(); j++) {
                                System.out.printf("[%s] Amount %s%n", j+1 , transactions.get(j).doubleValue());
                            }
                        }
                    }
                    return true;
            }
        }
        return false;
    }
}
