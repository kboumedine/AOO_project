package fr.pantheonsorbonne.cri.entity;

import java.util.Date;

import fr.pantheonsorbonne.cri.common.exceptions.PublicationException;
import fr.pantheonsorbonne.cri.common.interfaces.IPublicable;

public class Publication  implements IPublicable{
    private int PostId;
    private String title;
    private String type;
    private String content;    
    private String date;
    private int UserId;
    Date currentDate = new Date();


    public Publication(int postId, String title, String type, String content, int userId) {
        PostId = postId;
        this.title = title;
        this.type = type;
        this.content = content;
        this.date = currentDate.toString();
        UserId = userId;
    }

    public int getPostId() {
        return PostId;
    }

    public void setPostId(int postId) {
        PostId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    @Override
    public void publish() throws PublicationException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'publish'");
    }

    @Override
    public String displayDetails() throws PublicationException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayDetails'");
    }
    
    
}
