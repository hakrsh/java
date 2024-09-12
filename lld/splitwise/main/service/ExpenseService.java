package lld.splitwise.main.service;

import lld.splitwise.main.model.Expense;
import lld.splitwise.main.model.User;
import lld.splitwise.main.model.UserShare;
import lld.splitwise.main.repository.ExpenseRepository;
import lld.splitwise.main.repository.UserRepository;

import java.time.LocalDateTime;

public class ExpenseService {
    public Expense createExpense(String title, String description, LocalDateTime createdAt, double amount,
            String userId) {
        Expense expense = new Expense.Builder()
                .title(title)
                .description(description)
                .createdAt(createdAt)
                .amount(amount)
                .userId(userId)
                .build();
        ExpenseRepository.expenseMap.putIfAbsent(expense.getId(), expense);
        return expense;
    }
    public void addUsersToExpense(String expenseId,String email) throws Exception {
        Expense expense = ExpenseRepository.expenseMap.get(expenseId);
        if(expense == null) {
            throw new Exception("Expense not found");
        }
        User user = UserRepository.userMap.get(email);
        if(user == null) {
            throw new Exception("User not found");
        }
        expense.getExpenseGroup().getGroupMembers().add(email);
    }
    public void assignExpenseShare(String expenseId, String email, double share) throws Exception {
        Expense expense = ExpenseRepository.expenseMap.get(expenseId);
        if(expense == null) {
            throw new Exception("Expense not found");
        }
        User user = UserRepository.userMap.get(email);
        if(user == null) {
            throw new Exception("User not found");
        }
        expense.getExpenseGroup().getUserContributions().putIfAbsent(email, new UserShare(email, share));
    }
}
