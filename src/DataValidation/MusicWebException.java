package DataValidation;

public class MusicWebException extends Exception {

    public MusicWebException(String errorMessage){
        super(errorMessage);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
