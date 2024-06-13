package may.ex_25052024.enumfun;

public class HTTPStatus {
    public static void main(String[] args) {
        HTTPStatusCODE status = HTTPStatusCODE.OK;
        System.out.println(status.getCode() +"--"+ status.getMessage());

    }

}

enum HTTPStatusCODE{
    OK(200,"OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    BAD_REQUEST(204, "Bad Request");

    private int code;
    private String message;

    HTTPStatusCODE(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}