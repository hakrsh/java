package lld.splitwise.main.model;

import java.util.*;
public class ExpenseGroup {
    private String id;
    private Set<String> groupMembers;
    private Map<String,UserShare> userContributions;
    public ExpenseGroup() {
        this.id = UUID.randomUUID().toString();
        this.groupMembers = new HashSet<>();
        this.userContributions = new HashMap<>();
    }
    public Map<String,UserShare> getUserContributions() {
        return this.userContributions;
    }
    public Set<String> getGroupMembers(){
        return this.groupMembers;
    }
}
