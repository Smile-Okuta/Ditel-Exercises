package Chapter5;

public class TaxPlan {
    private int costExpenses;

    public int getCostExpenses() {
        return costExpenses;
    }

    public void setCostExpenses(int costExpenses) {
        this.costExpenses = costExpenses;
    }

    public int expenses() {
        return (23 * costExpenses) / 100;
    }
}

