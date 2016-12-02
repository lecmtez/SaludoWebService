package lecmtez.desapp.com.rest;

/**
 * Created by lec_m on 01/12/2016.
 */

public class Greeting {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String id;
    private String content;
}
