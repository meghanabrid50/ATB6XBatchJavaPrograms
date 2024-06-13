package may.ex_25052024.enumfun;

public enum APIENDPOINTS {

    HOME("homepage", "https://app.vwo.com"),
    LOGIN("loginPage" , "https://app.vwo.com/login"),
    DASHBOARD("dashPage" ,"https://app.vwo.com/dashboard");

    String url;
    String page;

    APIENDPOINTS(String page, String url) {
        this.page = page;
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
