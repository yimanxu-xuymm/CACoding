package use_case.clear_users;

import use_case.clear_users.ClearUserDataAccessInterface;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }
    public void execute() {
        userDataAccessObject.clearAllUsers();
        ClearOutputData clearOutputData = new ClearOutputData("All users cleared successfully.",false);
        clearPresenter.prepareSuccessView(clearOutputData);
    }

}
