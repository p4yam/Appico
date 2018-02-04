package ir.kivee.kpress.model;

/**
 * Created by narin on 2/4/18.
 */

public class News {

    private int id;
    private String title;
    private String Content;
    private String attachedImage;

    public News(int id, String title, String content, String attachedImage) {
        this.id = id;
        this.title = title;
        Content = content;
        this.attachedImage = attachedImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getAttachedImage() {
        return attachedImage;
    }

    public void setAttachedImage(String attachedImage) {
        this.attachedImage = attachedImage;
    }
}
