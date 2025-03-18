package cashflow.model;

import cashflow.analytics.AnalyticsManager;
import cashflow.dummy.DummyExpense;
import cashflow.dummy.DummyLoan;
import cashflow.dummy.DummySavings;
import expense_income.expense.ExpenseManager;
import expense_income.income.IncomeManager;


//Centralized data hub
public class FinanceData {
    private String currency = "$";

    // Integration modules for the other teams.
    private DummyExpense expenseIncomeManager;
    private DummySavings savingsManager;
    private DummyLoan loanDebtManager;

    // Your analytics module.
    private AnalyticsManager analyticsManager;

    // Nicholas Expense and Income Manager
    private ExpenseManager expenseManager;
    private IncomeManager incomeManager;

    public ExpenseManager getExpenseManager() {
        return expenseManager;
    }

    public IncomeManager getIncomeManager() {
        return incomeManager;
    }

    public FinanceData() {
        this.expenseManager = new ExpenseManager();
        this.incomeManager = new IncomeManager();
    }
    // Basic getters and setters.
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    //    // Categories management.
    //    public List<String> getCategories() {
    //        return categories;
    //    }
    //    public void addCategory(String category) {
    //        this.categories.add(category);
    //    }

    public DummyExpense getExpenseIncomeManager() {
        return expenseIncomeManager;
    }
    public void setExpenseIncomeManager(DummyExpense expenseIncomeManager) {
        this.expenseIncomeManager = expenseIncomeManager;
    }

    public DummySavings getSavingsManager() {
        return savingsManager;
    }
    public void setSavingsManager(DummySavings savingsManager) {
        this.savingsManager = savingsManager;
    }

    public DummyLoan getLoanDebtManager() {
        return loanDebtManager;
    }
    public void setLoanDebtManager(DummyLoan loanDebtManager) {
        this.loanDebtManager = loanDebtManager;
    }

    public AnalyticsManager getAnalyticsManager() {
        return analyticsManager;
    }
    public void setAnalyticsManager(AnalyticsManager analyticsManager) {
        this.analyticsManager = analyticsManager;
    }
}
