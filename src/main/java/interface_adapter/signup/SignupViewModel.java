package interface_adapter.signup;

import interface_adapter.ViewModel;

/**
 * The ViewModel for the Signup View.
 */
public class SignupViewModel extends ViewModel<SignupState> {

    public static final String TITLE_LABEL = "Create Your Account";
    public static final String USERNAME_LABEL = "Type your Email";
    public static final String PASSWORD_LABEL = "Choose password";
    public static final String REPEAT_PASSWORD_LABEL = "Enter password again";

    public static final String SIGNUP_BUTTON_LABEL = "Create Account";
    public static final String CANCEL_BUTTON_LABEL = "Go back";

    public SignupViewModel() {
        super("sign up");
        setState(new SignupState());
    }

}
