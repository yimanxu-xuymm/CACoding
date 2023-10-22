package use_case.clear_users;

import use_case.clear_users.ClearUserDataAccessInterface;
import java.util.List;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearOutputBoundary;
    }
    public void execute() {
        List<String> allUsers = userDataAccessObject.getAllUsernames();
        userDataAccessObject.clearAllUsers();
        ClearOutputData clearOutputData = new ClearOutputData(allUsers,false);
        clearPresenter.prepareSuccessView(clearOutputData);
    }

}
