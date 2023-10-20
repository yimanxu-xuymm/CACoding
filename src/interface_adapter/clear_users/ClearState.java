package interface_adapter.clear_users;

public class ClearState {
    private String feedbackMessage = null;
    private boolean operationCompleted = false;

    // Copy constructor
    public ClearState(ClearState copy) {
        feedbackMessage = copy.feedbackMessage;
        operationCompleted = copy.operationCompleted;
    }


    public ClearState() {}

    public String getFeedbackMessage() { return feedbackMessage; }

    public void setFeedbackMessage(String feedbackMessage) { this.feedbackMessage = feedbackMessage; }

    public boolean isOperationCompleted() { return operationCompleted; }

    public void setOperationCompleted(boolean operationCompleted) { this.operationCompleted = operationCompleted; }
}
