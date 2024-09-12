package lld.splitwise.main.model;
import java.util.*;;
public class UserShare {
    private String userId;
    private double share;
    private List<Contribution> contributions;

    public UserShare(String userId,double share) {
        this.userId = userId;
        this.share = share;
        this.contributions = new ArrayList<>();
    }
}
