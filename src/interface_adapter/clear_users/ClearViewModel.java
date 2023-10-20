package interface_adapter.clear_users;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    public final String TITLE_LABEL = "Clear Users View";
    public final String CONFIRMATION_LABEL = "Are you sure you want to clear all users?";
    public static final String CLEAR_BUTTON_LABEL = "Clear All";
    public static final String CANCEL_BUTTON_LABEL = "Cancel";

    private ClearState state = new ClearState();

    public ClearViewModel() { super("clear all users"); }

    public void setState(ClearState state) { this.state = state; }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);


    public void firePropertyChanged() { support.firePropertyChange("state", null, this.state); }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() { return state; }

}
