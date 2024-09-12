package lld.splitwise.main.model;

import java.time.LocalDateTime;
import java.util.*;;
public class Expense {
    private String id;
    private String userId;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private ExpenseStatus status;
    private double amount;
    private ExpenseGroup expenseGroup;

    public ExpenseGroup getExpenseGroup() {
        return this.expenseGroup;
    }

    public ExpenseStatus getStatus() {
        return this.status;
    }
    public String getId() {
        return this.id;
    }
    private Expense(Builder builder) {
        this.id = UUID.randomUUID().toString();
        this.userId = builder.userId;
        this.title = builder.title;
        this.description = builder.description;
        this.amount = builder.amount;
        this.expenseGroup = new ExpenseGroup();
    }
    public static class Builder {
        private String userId;
        private String title;
        private String description;
        private LocalDateTime createdAt;
        private double amount;

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }
        public Expense build() {
            return new Expense(this);
        }
    }
}

