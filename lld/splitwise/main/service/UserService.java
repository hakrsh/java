package lld.splitwise.main.service;

import lld.splitwise.main.Exceptions.InvalidExceptionState;
import lld.splitwise.main.Exceptions.InvalidExpense;
import lld.splitwise.main.model.Contribution;
import lld.splitwise.main.model.Expense;
import lld.splitwise.main.model.ExpenseGroup;
import lld.splitwise.main.model.ExpenseStatus;
import lld.splitwise.main.model.User;
import lld.splitwise.main.model.UserShare;
import lld.splitwise.main.repository.ExpenseRepository;
import lld.splitwise.main.repository.UserRepository;

public class UserService {
    public User createUser(String name,String email,String phoneNumber) {
        User user = new User(name, email, phoneNumber);
        UserRepository.userMap.putIfAbsent(email, user);
        return user;
    }
    public void contributeToExpense(String expenseId,String email,Contribution contribution) 
    throws InvalidExpense, InvalidExceptionState, Exception {
        Expense expense = ExpenseRepository.expenseMap.get(expenseId);
        if(expense == null) {
            throw new InvalidExpense("Expense not found");
        }
        ExpenseStatus expenseStatus = expense.getStatus();
        if(expenseStatus != ExpenseStatus.CREATED) {
            throw new InvalidExceptionState("Invalid expnse state");
        }
        if(expenseStatus == ExpenseStatus.SETTLED) {
            throw new Exception("Expense is alreayd settled");
        }
        ExpenseGroup expenseGroup = expense.getExpenseGroup();
        UserShare userShare = expenseGroup.getUserContributions().get(email);
    }
}
