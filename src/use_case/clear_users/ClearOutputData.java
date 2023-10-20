package use_case.clear_users;

public class ClearOutputData {
    private final String message;
    private boolean useCaseFailed;

    public ClearOutputData(String message, boolean useCaseFailed) {
        this.message = message;
        this.useCaseFailed = useCaseFailed;
    }

    public String getMessage() {
        return message;
    }

}
