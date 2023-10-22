package use_case.clear_users;

import java.util.List;

public class ClearOutputData {
    private final List<String> clearedUsers;
    private boolean useCaseFailed;

    public ClearOutputData(List<String> clearedUsers, boolean useCaseFailed) {
        this.clearedUsers = clearedUsers;
        this.useCaseFailed = useCaseFailed;
    }

    public List<String> getClearedUsers() {
        return clearedUsers;
    }

}
