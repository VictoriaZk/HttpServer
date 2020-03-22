public enum HttpCodes {
    OK(200, "OK"),
    CREATED(201, "Created"),
    MOVED(302, "Moved Temporarily"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized "),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    SERVER_ERROR(500, "Internal Server Error "),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version Not Supported ");

    private Integer code;
    private String description;

    HttpCodes(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
